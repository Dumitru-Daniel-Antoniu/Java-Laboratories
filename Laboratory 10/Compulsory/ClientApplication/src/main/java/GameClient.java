import java.io.*;
import java.net.*;

public class GameClient {
    public GameClient() {}
    public void communication(String host, int port) throws IOException {
        try (
                Socket socket = new Socket(host, port);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
                ) {
            String request;
            while((request = stdIn.readLine()) != null) {
                out.println(request);
            }
            String response = in.readLine();
            System.out.println(response);
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
