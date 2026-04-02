import java.util.Scanner;

public class exception2 {
    public static void main(String[] args) {
        int a = 0;
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter age: ");
                a = Integer.parseInt(input.next());
                valid = true;

            } catch (NumberFormatException e) {
                System.out.println("Enter valid number");
            }
        } while (!valid);
        System.out.println("age is : " + a);
        input.close();
    }
}
