import java.net.*;

public class UDPclient1 {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();
            int port = 5000;

            String msg = "Hello";
            byte[] senddata = new byte[1024];
            senddata = msg.getBytes();

            DatagramPacket dp = new DatagramPacket(senddata, senddata.length,ip,port);
            ds.send(dp);
            
            ds.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
