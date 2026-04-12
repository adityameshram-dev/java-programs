// Print ASCII value of any Character enterd by user

import java.util.Scanner;

public class Que01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Character: ");
        char ch = sc.next().charAt(0);
        int ASCII = ch;
        System.out.println("ASCII value of " + ch + " is " + ASCII);
        sc.close();
    }
}