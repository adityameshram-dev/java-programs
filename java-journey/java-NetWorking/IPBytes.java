import java.net.*;

public class IPBytes {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();

            byte[] by = ip.getAddress();
            String readableIP = "";

            for (int i = 0; i < by.length; i++) {
                int unsignedByte = by[i] & 0xFF;
                readableIP += unsignedByte;

                if (i < by.length - 1) {
                    readableIP += ".";
                }
            }

            System.out.println("Readable IP: " + readableIP);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}