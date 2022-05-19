import java.io.IOException;
import java.net.Socket;

public class Connection {

    static void sendInputToAppServer(byte[] payload) {
        try {
            Socket socket = new Socket("localhost", 50665);
            socket.getOutputStream().write(payload);

            socket.close();
        } catch (IOException ignored) {
        }
    }

    static void sendInputToUIServer(byte[] payload) {
        try {
            Socket socket = new Socket("localhost", 50666);
            socket.getOutputStream().write(payload);

            socket.close();
        } catch (IOException ignored) {
        }
    }
}
