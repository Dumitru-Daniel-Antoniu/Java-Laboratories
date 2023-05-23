package example;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/players")
public class Controller {
    @GetMapping
    public List<String> countPlayers() throws SQLException, ClassNotFoundException {
        List<String> players = new ArrayList<>();
        PlayerDAO playerDAO = new PlayerDAO();
        players = playerDAO.listOfPlayers();
        Database.getConnection().close();
        return players;
    }
    @PostMapping
    public String newPlayer(@RequestParam String username) throws SQLException, ClassNotFoundException {
        PlayerDAO playerDAO = new PlayerDAO();
        playerDAO.create(username);
        Database.getConnection().commit();
        return username;
    }
}
