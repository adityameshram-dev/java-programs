import java.net.*;

public class IP {
    public static void main(String[] args) {
        try {

            // Get ALL IP addresses of a domain (www.google.com)
            // A domain can have multiple IPs (for load balancing)
            InetAddress[] ip = InetAddress.getAllByName("www.google.com");

            // Loop to print each IP address
            for (InetAddress i : ip) {
                System.out.println(i.getHostAddress());
            }

            // Get single IP and host name of a domain
            InetAddress ip1 = InetAddress.getByName("google.com");

            System.out.println(ip1.getHostName());    
            System.out.println(ip1.getHostAddress()); 

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}