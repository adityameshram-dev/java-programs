import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = input.next();
        System.out.println(name);
        input.close();
    }
}