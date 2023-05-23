import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException {
        if(args.length != 1) {
            System.err.println("Usage: java ServerApplication <port number>");
            System.exit(1);
        }
        int port = Integer.parseInt(args[0]);
        GameServer gameServer = new GameServer(port);
    }
}
