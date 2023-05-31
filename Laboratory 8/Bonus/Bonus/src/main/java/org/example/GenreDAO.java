package org.example;

import java.sql.*;

public class GenreDAO extends DataDAO<Genre> {
    public void create(Genre genre) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement("insert into genres values (?, ?)")) {
            preparedStatement.setInt(1, genre.getId());
            preparedStatement.setString(2, genre.getName());
            preparedStatement.executeUpdate();
        }
    }

    public Genre findByName(Genre genre) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select Id from Genres where Name = '" + genre.getName() + "'")) {
            if(resultSet.next()) {
                genre.setId(resultSet.getInt(1));
                return genre;
            }
            else return null;
        }
    }

    public Genre findById(Genre genre) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select Name from Genres where Id = '" + genre.getId() + "'")) {
            if(resultSet.next()) {
                genre.setName(resultSet.getString(1));
                return genre;
            }
            else return null;
        }
    }
}
