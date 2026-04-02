// Factorial of number 

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        int fact = 1, i, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
        input.close();
    }
}
