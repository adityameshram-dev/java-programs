import java.net.*;
import java.io.*;

public class urlcon1 {

    public static void main(String[] args) {
        try {
            URI uri = new URI("http://google.com");
            URL url = uri.toURL();

            URLConnection con = url.openConnection();
            InputStream is = con.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Note
/*
    In Java 20+, URL(String) constructor is deprecated because it does not
    perform proper validation.
    Instead, URI is used first for strict parsing and then converted to URL using
    toURL() method.
 */