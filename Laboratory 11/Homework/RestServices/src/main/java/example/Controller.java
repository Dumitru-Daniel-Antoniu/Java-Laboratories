package example;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/players")
public class Controller {
    private List<String> players = new ArrayList<>();
    private String[][] games;
    @GetMapping("/printPlayers")
    public List<String> allPlayers() throws SQLException, ClassNotFoundException {
        PlayerDAO playerDAO = new PlayerDAO();
        players = playerDAO.listOfPlayers();
        return players;
    }
    @PostMapping("/addPlayer")
    public ResponseEntity<String> newPlayer(@RequestBody String username) throws SQLException, ClassNotFoundException {
        PlayerDAO playerDAO = new PlayerDAO();
        players = playerDAO.listOfPlayers();
        playerDAO.create(players.size() + 1, username);
        Database.getConnection().commit();
        return new ResponseEntity<>("Product created", HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updatePlayer(@PathVariable int id, @RequestBody String username) throws SQLException, ClassNotFoundException {
        PlayerDAO playerDAO = new PlayerDAO();
        int affectedRows = playerDAO.modifyPlayer(id, username);
        if(affectedRows == 0) {
            players = playerDAO.listOfPlayers();
            playerDAO.create(players.size() + 1, username);
            Database.getConnection().commit();
            return new ResponseEntity<>("Product added", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Product updated", HttpStatus.OK);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePlayer(@PathVariable int id) throws SQLException, ClassNotFoundException {
        PlayerDAO playerDAO = new PlayerDAO();
        int affectedRows = playerDAO.subPlayer(id);
        Database.getConnection().commit();
        if(affectedRows == 0) {
            return new ResponseEntity<>("Product does not exist", HttpStatus.GONE);
        }
        else {
            return new ResponseEntity<>("Product deleted", HttpStatus.OK);
        }
    }
    @GetMapping("/games")
    public String[][] allGames() throws SQLException, ClassNotFoundException {
        GameDAO gameDAO = new GameDAO();
        games = gameDAO.listOfGames();
        return games;
    }
}
