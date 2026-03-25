import java.net.*;
import java.util.Scanner;

public class pra23_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter hostname");
            String host = sc.next();
            InetAddress ip = InetAddress.getByName(host);
            System.out.println(ip.getHostAddress());
            sc.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
// Aditya
