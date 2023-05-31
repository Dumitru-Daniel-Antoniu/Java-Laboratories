package org.example;

import java.sql.*;

public class PlaylistDAO extends DataDAO<Playlist> {
    public void create(Playlist playlist) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement("insert into playlists values (?, ?, ?, ?)")) {
            preparedStatement.setInt(1, playlist.getId());
            preparedStatement.setString(2, playlist.getName());
            preparedStatement.setTimestamp(3, playlist.getTime());
            preparedStatement.setString(4, playlist.getAlbumsNames());
            preparedStatement.executeUpdate();
        }
    }

    public Playlist findByName(Playlist playlist) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select Id from Playlists where Name = '" + playlist.getName() + "'")) {
            if(resultSet.next()) {
                playlist.setId(resultSet.getInt(1));
                return playlist;
            }
            else return null;
        }
    }

    public Playlist findById(Playlist playlist) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select Name from Playlists where Id = '" + playlist.getId() + "'")) {
            if(resultSet.next()) {
                playlist.setName(resultSet.getString(1));
                return playlist;
            }
            else return null;
        }
    }
}
