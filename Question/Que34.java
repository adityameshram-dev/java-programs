// Write a program to retrieve and display port number and host name of an URL.

import java.net.*;

public class Que34 {
    public static void main(String[] args) throws Exception {

        URI uri = new URI("https://google.com:8080");
        URL url = uri.toURL();
        System.out.println(url.getPort());
        System.out.println(url.getHost());
    }
}
