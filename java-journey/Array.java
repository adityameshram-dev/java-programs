// print array element

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Element in array:  ");
        int n = input.nextInt();
        int a[] = new int[n];
        int i;
        System.out.println("Enter Element of Array");
        for(i=0;i<a.length;i++) {
            a[i] = input.nextInt();
        }
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        input.close();
    }
}