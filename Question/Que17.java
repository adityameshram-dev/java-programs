// Write a program to input name and salary of employee and 
// throw user defined exception if entered salary is negative

import java.util.Scanner;

class NegativeSalary extends Exception {
    NegativeSalary(String msg) {
        super(msg);
    }
}

public class Que17 {
    public static void checksalary(String name, double sal) throws NegativeSalary {
        if (sal < 0) {
            throw new NegativeSalary("salary can't negative");
        } else {
            System.out.println("name: " + name + " salary: " + sal);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and salary: ");
        String name = sc.next();
        double salary = sc.nextDouble();
        try {
            checksalary(name, salary);
        } catch(NegativeSalary e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
