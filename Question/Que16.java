// Write a program to create user defined exception “MIN-BAL”. 
// Throw the exception when balance in account is below 500 rupees

import java.util.Scanner;

class MIN_BAL extends Exception {
    MIN_BAL(String msg) {
        super(msg);
    }
}

public class Que16 {
    public static void checkbalance(double bal) throws MIN_BAL {
        if (bal < 500) {
            throw new MIN_BAL("Balance is below minimum (500)");
        }
        System.out.println("Your balance is: " + bal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        try {
            checkbalance(balance);
        } catch (MIN_BAL e) {
            System.out.println(e.getMessage()); 
        }

        sc.close();
    }
}
