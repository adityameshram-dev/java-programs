import java.net.*;
import java.util.Scanner;
import java.io.*;
public class pra25_4_Client {
    public static void main(String[] args) {
        String username,pass,msg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        username = sc.next();
        System.out.println("Enter password: ");
        pass = sc.next();
        try {
            Socket s = new Socket("Localhost",5000);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            dos.writeUTF(username);
            dos.writeUTF(pass);
            msg = dis.readUTF();
            if(msg.equals("Login")) {
                System.out.println("Login");
            } else {
                System.out.println("Login Denied");
            }
            s.close();
        } catch(Exception e) {
            e.printStackTrace();
        } sc.close();
    }
}
// Aditya
