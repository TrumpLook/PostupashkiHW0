import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",8080);
        InputStream in = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String response = reader.readLine();
        System.out.println(response);
        reader.close();
        socket.close();
    }
}
