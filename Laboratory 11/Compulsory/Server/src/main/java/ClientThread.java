import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.*;

public class ClientThread extends Thread {
    private Socket socket = null;
    private String username = null;

    public String getUsername() {
        return this.username;
    }

    public ClientThread(Socket socket) {
        this.socket = socket;
    }
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String request;
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            String response;
            while((request = in.readLine()) != null) {
                if(request.equals("exit")) socket.close();
                else {
                    if (request.equals("stop")) {
                        response = "Server stopped";
                        out.println(response);
                        out.flush();
                    }
                    else {
                        username = request;
                        var players = new PlayerDAO();
//                        players.create(username);
//                        Database.getConnection().commit();
                        //Database.getConnection().close();
                        response = "Server received the request...";
                        out.println(response);
                        out.flush();
                    }
                }
            }
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
//        catch (SQLException ex) {
//            System.err.println(ex);
//        }
//        catch (ClassNotFoundException ex) {
//            System.err.println(ex);
//        }
    }
}