import java.net.*;
import java.util.Scanner;
public class pra26_3_Server {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(5000);
            Scanner sc = new Scanner(System.in);
            byte[] receiveBuffer = new byte[1024];
            byte[] sendBuffer;
            String msg = "";
            InetAddress clientAddress = null;
            int clientPort = 0;
            do {
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                ds.receive(receivePacket);
                msg = new String(receivePacket.getData(), 0, receivePacket.getLength());
                clientAddress = receivePacket.getAddress();
                clientPort = receivePacket.getPort();
                System.out.println("Client: " + msg);
                msg = sc.nextLine();
                sendBuffer = msg.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
                ds.send(sendPacket);
            } while (!msg.equalsIgnoreCase("bye"));
            ds.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// Aditya