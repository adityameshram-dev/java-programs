import java.net.*;
import java.util.Scanner;
public class pra26_3_Client {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            Scanner sc = new Scanner(System.in);
            InetAddress serverAddress = InetAddress.getByName("localhost");
            byte[] sendBuffer;
            byte[] receiveBuffer = new byte[1024];
            String msg = "";
            do {
                msg = sc.nextLine();
                sendBuffer = msg.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverAddress, 5000);
                ds.send(sendPacket);
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                ds.receive(receivePacket);
                msg = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server: " + msg);
            } while (!msg.equalsIgnoreCase("bye"));
            ds.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// Aditya