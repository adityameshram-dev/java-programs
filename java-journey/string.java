import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.next();

        System.out.println("hello " + name); // print string
        
        System.out.println("Lenght of name: " + name.length());
        // print length of string using lenght() method

        System.out.println(name.toUpperCase());
        // conver string into uppercase using toUpperCase() method

        System.out.println(name.charAt(3));
        // get Character from string at given location using charAt() method

        System.out.println("substring from main string " + name.substring(2));
        // return string from that index

        System.out.println(name.compareTo("b"));
        // comper 2 string same so return 0 

        System.out.println(name.equalsIgnoreCase("BITTU"));
        // return True or Flase i dont check case uppercase or lowaercase
        input.close();
    }
}