/*
Write a program to add 2 integer, 2 string and 2 float objects to a vector. 
Remove element specified by user and display the list. 
*/
import java.util.Vector;
import java.util.Scanner;

public class Que06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Object> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add("Hi");
        v.add("bittu");
        v.add(9.1);
        v.add(97.99);
        System.out.println(v);
        System.out.println("Enter element to remove: ");
        String element = sc.next();
        v.removeElement(element);
        System.out.println(v);
        sc.close();
    }
}
