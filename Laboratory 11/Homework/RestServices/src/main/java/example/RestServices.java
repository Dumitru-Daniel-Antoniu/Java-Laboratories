package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class RestServices {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SpringApplication.run(RestServices.class, args);
    }
}
