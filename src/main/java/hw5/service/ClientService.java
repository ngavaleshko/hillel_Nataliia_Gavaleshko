package hw5.service;

import hw5.entity.Client;
import hw5.database.Database;
import hw5.entity.ClientStatus;
import hw5.entity.Status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientService {
   private static final String SELECT_ALL_CLIENTS_QUERY = "SELECT * FROM clients";
   private static final String SAVE_CLIENT_QUERY = "INSERT INTO clients (name, email, phone, about) VALUES (?,?,?,?)";
   private static final String UPDATE_CLIENT_QUERY = "UPDATE clients set name=?, phone=? where id=?";
   private static final String DELETE_CLIENT_QUERY = "DELETE FROM CLIENTS where phone=?";
    private static final String SELECT_CLIENT_BY_PHONE = "SELECT * FROM CLIENT WHERE PHONE=?";
    private static final String SELECT_ALL_FROM_CLIENT_WHERE_ID = "select * from clients inner join accounts on clients.id = accounts.client_id";
    private static final String SELECT_ALL_FROM_CLIENT_WHERE_3_TABLES = "select  clients.name, clients.email, statuses.alias from clients inner join client_statuses on clients.id = client_statuses.clients_id inner join statuses on client_statuses.statuses_id=statuses.id";


    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_CLIENTS_QUERY);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setAbout(resultSet.getString("about"));
                client.setPhone(resultSet.getLong("phone"));
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void save(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(SAVE_CLIENT_QUERY)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2,client.getEmail());
            preparedStatement.setLong(3,client.getPhone());
            preparedStatement.setString(4,client.getAbout());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(UPDATE_CLIENT_QUERY)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setLong(2,client.getPhone());
            preparedStatement.setInt(3,client.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delete(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(DELETE_CLIENT_QUERY)) {
            connection.setAutoCommit(false);
            preparedStatement.setLong(1,client.getPhone());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Client>  searchClientByPhone(Client client){
        List<Client> clients = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_CLIENTS_QUERY);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setAbout(resultSet.getString("about"));
                client.setPhone(resultSet.getLong("phone"));
                clients.add(client);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }
    public List<Client> getAllWhereId() {
        List<Client> clients = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_FROM_CLIENT_WHERE_ID);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setAbout(resultSet.getString("about"));
                client.setPhone(resultSet.getLong("phone"));
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }
    public List<ClientStatus> getAllWhere3Tables() {
        List<ClientStatus> clientStatuses = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_FROM_CLIENT_WHERE_3_TABLES);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
              ClientStatus clientStatus = new ClientStatus();
                clientStatus.setEmail(resultSet.getString("email"));
                clientStatus.setName(resultSet.getString("name"));
                clientStatus.setAlias(resultSet.getString("alias"));
                clientStatuses.add(clientStatus);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientStatuses;
    }
    }
