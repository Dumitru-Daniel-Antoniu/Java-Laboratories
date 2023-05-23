import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GameServer {
    public GameServer(int port) throws IOException {
        ServerSocket serverSocket = null;
        try {
            System.out.println("Waiting for a client...");
            serverSocket = new ServerSocket(port);
            while(true) {
                Socket socket = serverSocket.accept();
                System.out.println("Username: ");
                ClientThread clientThread = new ClientThread(socket);
                clientThread.start();
            }
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}