package hw5.service;

import hw5.database.Database;
import hw5.entity.Account;
import hw5.entity.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private static final String SELECT_ALL_ACCOUNTS_QUERY = "SELECT * FROM accounts";
    private static final String SAVE_ACCOUNT_QUERY = "INSERT INTO accounts (number, client_id,value) VALUES (?,?,?)";
    private static final String UPDATE_ACCOUNT_QUERY = "UPDATE accounts set number=?, value=? where client_id=?";
    private static final String DELETE_ACCOUNT_QUERY = "DELETE FROM accounts where value=?";
    private static final String SELECT_NUMBER_FROM_ACCOUNTS_QUERY = "SELECT NUMBER FROM accounts WHERE VALUE>?";

    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
              ResultSet resultSet = statement.executeQuery(SELECT_ALL_ACCOUNTS_QUERY);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Account account = new Account();
                account.setClient_id(resultSet.getInt("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getDouble("value"));
                accounts.add(account);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public void saveAccount(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(SAVE_ACCOUNT_QUERY)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, account.getNumber());
            preparedStatement.setInt(2,account.getClient_id());
            preparedStatement.setDouble(3,account.getValue());
            //init settings
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateAccount(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(UPDATE_ACCOUNT_QUERY)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, account.getNumber());
            preparedStatement.setDouble(2,account.getValue());
            preparedStatement.setInt(3,account.getClient_id());

            //init settings
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteAccount(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(DELETE_ACCOUNT_QUERY)) {
            connection.setAutoCommit(false);
            preparedStatement.setDouble(1,account.getValue());
            //init settings
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Account> getNumberFromAccount(Account account) {
        List<Account> accounts = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_NUMBER_FROM_ACCOUNTS_QUERY);
            while (resultSet.next()) {
                connection.setAutoCommit(false);

                account.setNumber(resultSet.getString("number"));

                accounts.add(account);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }


}

