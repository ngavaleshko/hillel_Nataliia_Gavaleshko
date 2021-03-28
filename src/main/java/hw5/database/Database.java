package hw5.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

        private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
        private static final String USERNAME = "postgres";
        private static final String PASSWORD = "1111";

        public static Connection getConnection() {
            Connection connection = null;
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                connection.setAutoCommit(false);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }

