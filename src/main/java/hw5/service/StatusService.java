package hw5.service;

import hw5.database.Database;
import hw5.entity.Client;
import hw5.entity.Status;

import javax.net.ssl.SSLEngineResult;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StatusService {
    private static final String SELECT_ALL_STATUSES_QUERY = "SELECT * FROM STATUSES";
    private static final String SAVE_STATUSES_QUERY = "INSERT INTO STATUSES (alias, description) VALUES (?,?)";
    private static final String UPDATE_STATUSES_QUERY = "UPDATE STATUSES set description=? where id=?";
    private static final String DELETE_STATUSES_QUERY = "DELETE FROM STATUSES where id=?";


    public List<Status> getAllStatuses() {
        List<Status> statuses = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_STATUSES_QUERY);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Status status = new Status();
                status.setAlias(resultSet.getString("alias"));
                status.setDescription(resultSet.getString("description"));
                statuses.add(status);
                //init settings
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statuses;
    }

    public void saveStatuses(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(SAVE_STATUSES_QUERY)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1,status.getAlias());
            preparedStatement.setString(2,status.getDescription());


            //init settings
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStatuses(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(UPDATE_STATUSES_QUERY)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, status.getDescription());
            preparedStatement.setInt(2,status.getId());

            //init settings
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteStatuses(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(DELETE_STATUSES_QUERY)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, status.getId());
            //init settings
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
