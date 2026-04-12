// Write a program to read and display content from the url “http://www.google.com”

import java.net.*;
import java.io.*;

public class Que36 {
    public static void main(String[] args) {
        try {

            URI uri = new URI("http://www.google.com");
            URL url = uri.toURL();
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch(Exception e) {
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