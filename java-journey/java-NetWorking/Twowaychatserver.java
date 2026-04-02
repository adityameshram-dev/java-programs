import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Twowaychatserver {
    public static void main(String[] args) {
        try {

            ServerSocket ss = new ServerSocket(5001);

            Socket s = ss.accept();
            System.out.println("Client connected!");

            Scanner sc = new Scanner(System.in);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            while (true) {

                String readmsg = dis.readUTF();
                if(readmsg.equals("bye")) {
                    break;
                }
                System.out.println("Client: " + readmsg);

                System.out.print("You: ");
                String sendmsg = sc.nextLine();
                if(sendmsg.equals("bye")) {
                    dos.writeUTF(sendmsg);
                    break;
                }
                dos.writeUTF(sendmsg);

            }
            sc.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
