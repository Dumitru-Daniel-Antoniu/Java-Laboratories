package example;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class PlayerDAO {
    public void create(String username) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement("insert into players values (?)")) {
            preparedStatement.setString(1, username);
            preparedStatement.executeUpdate();
        }
    }
    public List<String> listOfPlayers() throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        List<String> players = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet total = statement.executeQuery("select count(name) from players");
            int number = total.next() ? total.getInt(1) : 0;
            for (int i = 1; i <= number; i++) {
                ResultSet resultSet = statement.executeQuery("select name from players where id = '" + i + "'");
                players.add(resultSet.next() ? resultSet.getString(1) : "null");
            }
            return players;
        }
    }
}
