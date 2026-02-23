import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true){
            Socket clientSocket = serverSocket.accept();
            OutputStream out = clientSocket.getOutputStream();
            out.write("OK\n".getBytes());
            out.flush();
            clientSocket.close();
        }

    }
}
