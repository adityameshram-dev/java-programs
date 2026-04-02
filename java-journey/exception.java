public class exception {
    public static void main(String[] args) {
        int a = 5,b = 0;
        int result;
        try {
            result = a/b;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("can't divide by zero");
        }
    }
}