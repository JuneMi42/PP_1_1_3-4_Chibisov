package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String url = "jdbc:mysql://localhost:3306/first_lesson";
    private static final String userName = "root";
    private static final String pass = "1234";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, userName, pass);
            connection.setAutoCommit(false);
            System.out.println("Connection successful");
        } catch (SQLException e) {
            System.out.println("Connection error");
        }
        return connection;
    }

}
