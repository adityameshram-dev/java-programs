import java.util.Vector;
import java.util.Scanner;

public class vector1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Element in vectore: ");
        for (int i = 0; i < 4; i++) {
            v.add(input.nextInt());
        }
        System.out.println(v);
        input.close();
    }
}
