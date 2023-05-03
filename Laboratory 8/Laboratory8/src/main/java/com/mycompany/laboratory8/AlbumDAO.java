package com.mycompany.laboratory8;

import java.sql.*;

public class AlbumDAO {
    public void create(int id, int releaseYear, String title, String artist, String genre) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement("insert into albums values (?, ?, ?, ?, ?)")) {
            preparedStatement.setInt(1,id);
            preparedStatement.setInt(2, releaseYear);
            preparedStatement.setString(3, title);
            preparedStatement.setString(4, artist);
            preparedStatement.setString(5,genre);
            preparedStatement.executeUpdate();
        }
    }
    public String findByArtist(String artist) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select title from albums where artist='" + artist + "'")) {
            return resultSet.next() ? resultSet.getString(1) : null;
        }
    }
    public String findByGenre(String genre) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select title from albums where genre='" + genre + "'")) {
            return resultSet.next() ? resultSet.getString(1) : null;
        }
    }
    public String findById(int id) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select title from albums where id='" + id + "'")) {
            return resultSet.next() ? resultSet.getString(1) : null;
        }
    }
}
