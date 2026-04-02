import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number");
        int num = input.nextInt();
        int dem = num;
        double sum = 0;
        double n = String.valueOf(num).length();
        while(num>0) {
            double digit = num%10;
            sum += Math.pow(digit, n);
            num = num/10;
        }
        if(dem==sum) {
            System.out.println("yes");
        } else {
            System.out.println("not");
        }
        input.close();
    }
}
