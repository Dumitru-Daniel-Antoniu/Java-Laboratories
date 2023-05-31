package com.mycompany.optional;

import java.sql.*;

public class ArtistDAO extends DataDAO<Artist> {
    public void create(Artist artist) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement("insert into artists values (?, ?)")) {
            preparedStatement.setInt(1, artist.getId());
            preparedStatement.setString(2, artist.getName());
            preparedStatement.executeUpdate();
        }
    }

    public Artist findByName(Artist artist) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select Id from Artists where Name = '" + artist.getName() + "'")) {
            if(resultSet.next()) {
                artist.setId(resultSet.getInt(1));
                return artist;
            }
            else return null;
        }
    }

    public Artist findById(Artist artist) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select Name from Artists where Id = '" + artist.getId() + "'")) {
            if(resultSet.next()) {
                artist.setName(resultSet.getString(1));
                return artist;
            }
            else return null;
        }
    }

}
