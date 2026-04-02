// revers string
import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String name = input.next();
        String rev = "";
        System.out.println(name);
        for (int i = name.length()-1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        System.out.println(rev);
        input.close();
    }
}