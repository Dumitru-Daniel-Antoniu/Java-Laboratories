import java.io.*;
import java.lang.*;
import java.net.*;

public class ClientThread extends Thread {
    private Socket socket = null;
    public ClientThread(Socket socket) {
        this.socket = socket;
    }
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String request = in.readLine();
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            String response;
            if(request.equals("stop")) response = "Server stopped";
            else response = "Server received the request...";
            out.println(response);
            //out.flush();
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
