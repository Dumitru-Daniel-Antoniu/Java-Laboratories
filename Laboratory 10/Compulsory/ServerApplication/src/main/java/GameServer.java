import java.net.*;
import java.io.*;

public class GameServer {
    public GameServer(int port) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            while(true) {
                System.out.println("Waiting for a client...");
                Socket socket = serverSocket.accept();
                new ClientThread(socket).start();
            }
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
