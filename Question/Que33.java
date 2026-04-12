// Write a program to display the protocol, host, port and file of URL (Accept URL from user).

import java.net.*;
import java.util.Scanner;

public class Que33 {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter URL");

            URI uri = new URI(sc.next());
            URL url = uri.toURL();

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
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