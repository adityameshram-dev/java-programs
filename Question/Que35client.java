// Write a program to implement the following using serversocket and socket.
/*
    i) Client should send a number to server.
    ii) Server should check if the number is even or odd and send response to client.
    iii) Client displays output.

*/

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Que35client {
    public static void main(String[] args) {
        try {
            int num;
            Scanner sc = new Scanner(System.in);
            Socket s = new Socket("localhost", 5002);

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            System.out.println("Enter number: ");
            num = sc.nextInt();
            dos.writeInt(num);

            DataInputStream dis = new DataInputStream(s.getInputStream());
            String result = dis.readUTF();
            System.out.println(result);

            s.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
