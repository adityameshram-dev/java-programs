import java.io.*;
import java.net.*;

public class pra25_4_Server {
     public static void main(String[] args) {
        String username;
        String pass;
        try {
            ServerSocket ss = new ServerSocket(5000);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            username = dis.readUTF();
            pass = dis.readUTF();
            if(username.equals("Admin@123") && pass.equals("1234")) {
                dos.writeUTF("Login");
            } else {
                dos.writeUTF("Login Denied");
            }
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// Aditya