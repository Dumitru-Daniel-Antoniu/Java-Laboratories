package com.mycompany.optional;

import java.sql.*;

public class DAO {
    public void create(Data object) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        if(object instanceof Artist) {
            try(PreparedStatement statement = connection.prepareStatement("insert into artists values (?, ?)")) {
            statement.setInt(1, object.getId());
            statement.setString(2,object.getName());
            }
        }
        if(object instanceof Genre) {
            try(PreparedStatement statement = connection.prepareStatement("insert into genres values (?, ?)")) {
            statement.setInt(1, object.getId());
            statement.setString(2,object.getName());
            }
        }
        if(object instanceof Album) {
            try(PreparedStatement statement = connection.prepareStatement("insert into albums values (?, ?, ?, ?, ?)")) {
            statement.setInt(1, object.getId());
            statement.setInt(2, object.getReleaseYear());
            statement.setString(3,object.getName());
            statement.setString(4,object.getArtist());
            statement.setString(5,object.getGenre());
            }
        }
    }
    public Data findByName(Data object, String name) throws SQLException, ClassNotFoundException{
        Connection connection = Database.getConnection();
        if(object instanceof Artist) {
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery("select Id from Artists where Name='" + name + "'")) {
            return resultSet.next() ?  : null;
            }
        }
    }
}
