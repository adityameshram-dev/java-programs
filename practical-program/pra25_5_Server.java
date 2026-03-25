import java.io.*;
import java.net.*;
import java.util.Scanner;
public class pra25_5_Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(7000);
            Socket s = ss.accept();
            Scanner sc = new Scanner(System.in);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            String msg;
            while (true) {
                msg = dis.readUTF();
                System.out.println("Client: " + msg);
                if(msg.equalsIgnoreCase("bye")) break;
                msg = sc.nextLine();
                dos.writeUTF(msg);
                if(msg.equalsIgnoreCase("bye")) break;
            }
            s.close();
            ss.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// Aditya