import java.net.*;
import java.util.Scanner;
public class url1 {

    public static void main(String[] args) {
        try {
            URI uri = new URI("https://google.com");
            URL url = uri.toURL();

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());

            Scanner input = new Scanner(url.openStream());
            for(int i=0; i<5 && input.hasNextLine(); i++) {
                System.out.println(input.nextLine());
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
