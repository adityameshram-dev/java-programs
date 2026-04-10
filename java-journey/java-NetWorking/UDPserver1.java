import java.net.*;

public class UDPserver1 {
    public static void main(String[] args)     {
        try {
            DatagramSocket ds = new DatagramSocket(5000);
            System.out.println("Server is ready to connect..");
            
            byte[] receivedata = new byte[1024];

            DatagramPacket dp = new DatagramPacket(receivedata, receivedata.length);
            ds.receive(dp);

            String msg = new String(dp.getData(),0,dp.getLength());

            System.out.println(msg);

            ds.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
