package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
public class Users {
    public List<String> findByName(String name) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select album from results where username = '" + name + "'")) {
            List<String> albums = new ArrayList<>();
            while(resultSet.next()) {
                albums.add(resultSet.getString(1));
            }
            return albums;
        }
    }
}
