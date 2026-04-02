import java.io.DataInputStream;
import java.net.*;

public class Server1 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is ready to connect ");
            Socket s = ss.accept();
            System.out.println("Client connect");

            DataInputStream dis = new DataInputStream(s.getInputStream());
            String msg = dis.readUTF();
            System.out.println(msg);
            
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
