public class exception4 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++) {
            for(int j=5;j>=0;j--) {
                try {
                    System.out.println(i + " / " + j + " = " + (i/j));
                } catch (ArithmeticException e) {
                    System.out.println(i + " / " + j  + " Divided by zero");
                }
            }
        }
    }
}
