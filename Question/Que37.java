// Write a program using URL and URL connection class to 
// retrieve the date content type, content of any entered URL.

import java.net.*;
import java.io.*;

public class Que37 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");

            URLConnection con = url.openConnection();
            InputStream is = con.getInputStream();
            BufferedReader bf = new BufferedReader(new InputStreamReader(is));

            String line;
            while((line = bf.readLine()) != null) {
                System.out.println(line);
            }
            bf.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
