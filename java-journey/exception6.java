public class exception6 {
    public void check(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        exception6 ex = new exception6();
        try {
            ex.check(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        }
    }
}
