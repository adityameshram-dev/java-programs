import java.net.*;

public class Host {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
            System.out.println("Raw IP Address: " + ip.getAddress());
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}