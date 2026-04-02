import java.net.*;

public class Hi {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println(ip.getHostName());
            System.out.println(ip.getHostAddress());
            byte[]  add = ip.getAddress();
            for(byte b : add) {
            System.out.println(b);
            }
            System.out.println(ip.getAddress());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
