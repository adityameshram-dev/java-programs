// Write a program to input name and age of a person and throws exception if entered age is negative.

import java.util.Scanner;

public class Que19 {
    public static void checkage(int age,String name) {
        try {
            if (age < 0) {
                throw new ArithmeticException("Age can't be Negative..");
            }
            System.out.println("Your Name: " + name);
            System.out.println("Your Age: " + age);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name and age");
        String name = sc.next();
        int age = sc.nextInt();
        checkage(age,name);
        sc.close();
    }
}
