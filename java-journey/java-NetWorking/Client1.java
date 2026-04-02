import java.io.*;
import java.net.*;

public class Client1 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",5000);  

            System.out.println(s.isConnected());

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("hello server");
            
            s.close();
        } catch(Exception e) {
            System.out.println(e);
        }
       
    }
}