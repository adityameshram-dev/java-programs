// reverse array element
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        int i;
        System.out.println("Enter array element: ");
        for (i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        for (i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]);
        }
        input.close();
    }
}