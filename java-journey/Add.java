import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("enter secound number: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.printf("Addition of %d and %d is %d", num1, num2, sum);
        input.close();
    }
}