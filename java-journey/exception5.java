public class exception5 {
    public void check(int age) {
        if(age<18) {
            throw new ArithmeticException("not eligible for vote");
        } else {
            System.out.println("ok");
        }
    }
    public static void main(String[] args) {
        exception5 ex = new exception5();
        try {
            ex.check(19);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
