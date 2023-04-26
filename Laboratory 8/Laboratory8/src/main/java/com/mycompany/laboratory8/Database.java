package com.mycompany.laboratory8;

import java.sql.*;

public class Database {
    private static final String URL = "jdbc:postgresql://localhost:5432/albums";
    private static final String USER = "postgres";
    private static final String PASSWORD = "parola";
    private static Connection connection = null;
    private Database() {}
    private static void createConnection() throws ClassNotFoundException {
        try {
            //Class.forName("postgresql-42.6.0.jar");
            connection.setAutoCommit(false);
        }
        catch(SQLException ex) {
            System.err.println(ex);
        }
    }
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        connection = DriverManager.getConnection(URL,USER,PASSWORD);
        Database.createConnection();
        return connection;
    }
    public static void closeConnection() throws SQLException {
        connection.close();
    }
}
