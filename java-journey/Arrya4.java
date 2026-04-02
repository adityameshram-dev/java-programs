// sum of array element 

import java.util.Scanner;

public class Arrya4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter Array element");
        int i,sum = 0;
        for(i=0;i<a.length;i++) {
            a[i] = input.nextInt();
            sum+=a[i];
        }
        System.out.println("sum: " + sum);
        
        input.close();
    }
}