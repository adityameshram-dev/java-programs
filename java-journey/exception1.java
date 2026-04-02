import java.util.Scanner;

public class exception1 {
    public static void main(String[] args) {
        int [] arr = new int [5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array element: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = input.nextInt();
        }
        try {
            System.out.println("Array element: ");
            for(int i=0;i<6;i++) {
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("index out of bound");
            }
            input.close();
    }
}
