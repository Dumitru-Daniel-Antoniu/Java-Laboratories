import java.sql.*;

public class PlayerDAO {
    public void create(String username) throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement("insert into players values (?)")) {
            preparedStatement.setString(1, username);
            preparedStatement.executeUpdate();
        }
    }
}
