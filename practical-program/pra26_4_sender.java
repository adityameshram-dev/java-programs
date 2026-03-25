import java.net.*;
import java.io.*;
public class pra26_4_sender {
    public static void main(String[] args) {
        String sourceFile = "source.txt"; // file to copy
        int port = 5000;
        try {
            DatagramSocket ds = new DatagramSocket();
            InetAddress receiverAddress = InetAddress.getByName("localhost");
            FileInputStream fis = new FileInputStream(sourceFile);
            byte[] buffer = new byte[1024]; // packet size
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                DatagramPacket packet = new DatagramPacket(buffer, bytesRead, receiverAddress, port);
                ds.send(packet);
            }
            byte[] endSignal = "EOF".getBytes();
            DatagramPacket endPacket = new DatagramPacket(endSignal, endSignal.length, receiverAddress, port);
            ds.send(endPacket);
            System.out.println("File sent successfully.");
            fis.close();
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// Aditya 