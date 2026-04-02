import java.net.*;

public class IPtypecheck {
    public static void main(String[] args) {
        try {
            
            InetAddress ip = InetAddress.getLocalHost();

            if (ip.isLoopbackAddress()) {
                System.out.println("IP: " + ip.getHostAddress());
                System.out.println("Loopback IP (Local PC)");
            } 
            else if (ip.isSiteLocalAddress()) {
                System.out.println("IP: " + ip.getHostAddress());
                System.out.println("Router IP");
            } 
            else {
                System.out.println("Public IP");
            }

            // Check whether IP is IPv4 or IPv6
            if (ip instanceof java.net.Inet4Address) {
                System.out.println("IPv4 address");
            } else if (ip instanceof java.net.Inet6Address) {
                System.out.println("IPv6 address");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}