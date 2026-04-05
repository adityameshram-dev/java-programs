import java.net.*;
import java.util.*;

public class Serverchatsystem {
    public static void main(String[] args) {
        try {
            
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("IP Address: " + ip.getHostAddress());

            ServerSocket ss = new ServerSocket(5001);
            List<Socket> a = Collections.synchronizedList(new ArrayList<>());

            while (true) {
                Socket s = ss.accept();
                a.add(s);
                Clienthandlerchatsystem handler = new Clienthandlerchatsystem(s, a);
                new Thread(handler).start();
            }
            // ss.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
