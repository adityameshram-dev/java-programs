// Write a program to implement the following using serversocket and socket.
/*
    i) Client should send a number to server.
    ii) Server should check if the number is even or odd and send response to client.
    iii) Client displays output.

*/

import java.net.*;
import java.io.*;

public class Que35server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5002);
            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            int num = dis.readInt();
            if (num % 2 == 0) {
                dos.writeUTF("Even number");
            } else {
                dos.writeUTF("Odd number");
            }
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
