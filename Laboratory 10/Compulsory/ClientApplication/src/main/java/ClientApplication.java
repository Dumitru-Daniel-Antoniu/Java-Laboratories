import java.io.IOException;
import java.net.UnknownHostException;

public class ClientApplication {
    public static void main(String[] args) throws UnknownHostException, IOException {
        if(args.length != 2) {
            System.err.println("Usage: java ClientApplication <host name> <port number>");
            System.exit(1);
        }
        String host = args[0];
        int port = Integer.parseInt(args[1]);
        GameClient gameClient = new GameClient();
        gameClient.communication(host, port);
    }
}
