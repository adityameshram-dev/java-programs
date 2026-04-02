import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Twowaychatclient {
    public static void main(String[] args) {
        try {

            Socket s = new Socket("localhost", 5001);
            System.out.println("Connected to server!");

            Scanner sc = new Scanner(System.in);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());

            while (true) {

                System.out.print("You: ");
                String sendmsg = sc.nextLine();
                if(sendmsg.equals("bye")) {
                    dos.writeUTF(sendmsg);
                    break;
                }
                dos.writeUTF(sendmsg);

                String readmsg = dis.readUTF();
                System.out.println("Server: " + readmsg);

            }
            sc.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
