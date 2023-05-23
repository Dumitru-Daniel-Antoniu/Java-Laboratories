package example;

import java.sql.*;
public class Database {
    private static final String URL = "jdbc:postgresql://localhost:5432/javaGame";
    private static final String USER = "postgres";
    private static final String PASSWORD = "parola";
    private static Connection connection = null;
    private Database() {}
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if(connection == null) createConnection();
        return connection;
    }
    private static void createConnection() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);
        }
        catch(SQLException ex) {
            System.err.println("SQL Problem: " + ex);
        }
        catch(ClassNotFoundException ex) {
            System.err.println("Class problem: " + ex);
        }
    }
    public static void closeConnection() throws SQLException {
        connection.close();
    }
}