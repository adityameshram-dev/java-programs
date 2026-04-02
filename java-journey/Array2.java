public class Array2 {
      public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.printf("%s%8s%n","index","data");
        for(int i=0;i<a.length;i++) {
            System.out.printf("%5d%7d%n",i,a[i]);
        }
    }
}
