import java.util.Scanner;

public class ifstsament {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter number: ");
        num1 = input.nextInt();
        System.out.print("Enter number: ");
        num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("big number is " + num1);
        }
        else if (num2>num1){
            System.out.println("big number is " + num2);
        }
        else {
            System.out.println("both number is same " + num1 + " and " + num2);
        }
        input.close();
    }
}