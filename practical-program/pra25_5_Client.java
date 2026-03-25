import java.net.*;
import java.io.*;
import java.util.Scanner;
public class pra25_5_Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",7000);
            Scanner sc = new Scanner(System.in);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            String msg;
            while (true) {
                msg = sc.nextLine();
                dos.writeUTF(msg);
                msg = dis.readUTF();
                System.out.println("Server: " + msg);
                if (msg.equalsIgnoreCase("bye")) break;
            }
            s.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// Aditya