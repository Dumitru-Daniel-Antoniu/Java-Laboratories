package example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GameDAO {
    public void create(int id, String game, String player1, String player2) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement("insert into players values (?, ?, ?, ?)")) {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, game);
            preparedStatement.setString(3, player1);
            preparedStatement.setString(4, player2);
            preparedStatement.executeUpdate();
        }
    }
    public String[][] listOfGames() throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement()) {
            ResultSet total = statement.executeQuery("select count(game) from games");
            int number = total.next() ? total.getInt(1) : 0;
            String[][] games = new String[number][3];
            for (int i = 1; i <= number; i++) {
                ResultSet first = statement.executeQuery("select game from games where id = '" + i + "'");
                games[i - 1][0] = first.next() ? first.getString(1) : "null";
                ResultSet second = statement.executeQuery("select player1 from games where id = '" + i + "'");
                games[i - 1][1] = second.next() ? second.getString(1) : "null";
                ResultSet third = statement.executeQuery("select player2 from games where id = '" + i + "'");
                games[i - 1][2] = third.next() ? third.getString(1) : "null";
            }
            return games;
        }
    }
}
