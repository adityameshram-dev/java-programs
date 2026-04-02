// Transfer array element to another array

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        int [] a = new int[5];
        int [] b = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element for array 'a': ");
        for(int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        System.out.println("Element of array 'b': ");
        for(int i:b) {
            System.out.println(i);
        }
        sc.close();
    }
}
