package com.mycompany.optional;

import java.sql.*;

public class AlbumDAO extends DataDAO<Album> {
    public void create(Album album) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement("insert into albums values (?, ?, ?, ?, ?)")) {
            preparedStatement.setInt(1, album.getId());
            preparedStatement.setInt(2, album.getReleaseYear());
            preparedStatement.setString(3, album.getTitle());
            preparedStatement.setString(4, album.getArtist());
            preparedStatement.setString(5, album.getGenre());
            preparedStatement.executeUpdate();
        }
    }

    public Album findByName(Album album) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select Id from Albums where Title = '" + album.getTitle() + "'")) {
            if(resultSet.next()) {
                album.setId(resultSet.getInt(1));
                return album;
            }
            else return null;
        }
    }

    public Album findById(Album album) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select Title from Albums where Id = '" + album.getId() + "'")) {
            if(resultSet.next()) {
                album.setTitle(resultSet.getString(1));
                return album;
            }
            else return null;
        }
    }
}
