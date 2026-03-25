import java.net.*;
import java.io.*;
public class pra26_4_receive {
    public static void main(String[] args) {
        String destFile = "destination.txt";
        int port = 5000;
        try {
            DatagramSocket ds = new DatagramSocket(port);
            FileOutputStream fos = new FileOutputStream(destFile);
            byte[] buffer = new byte[1024];
            while (true) {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                ds.receive(packet);
                String data = new String(packet.getData(), 0, packet.getLength());
                if (data.equals("EOF")) {
                    break;
                }
                fos.write(packet.getData(), 0, packet.getLength());
            }
            System.out.println("File received successfully.");
            fos.close();
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// Aditya