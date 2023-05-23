import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

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
            String response;
            while(true) {
                request = stdIn.readLine();
                if(request.equals("exit")) socket.close();
                out.println(request);
                response = in.readLine();
                System.out.println(response);
            }
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
