package com.mycompany.laboratory8;

import java.sql.*;

public class ArtistDAO {
    public void create(int id, String name) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement("insert into artists values (?, ?)")) {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.executeUpdate();
        }
    }
    public Integer findByName(String name) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select Id from Artists where Name='" + name + "'")) {
            return resultSet.next() ? resultSet.getInt(1) : null;
        }
    }
    public Genre findById(int id) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select Name from Artists where Id='" + id + "'")) {
            return resultSet.next() ? resultSet.getString(1) : null;
        }
    }
}
