public class exception3 {
    public void checked(int balence) {
        try {
            if(balence < 100)
                throw new ArithmeticException("balence is less");
            else
                System.out.println("ok balence");
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        exception3 ex = new exception3();
        ex.checked(12);
    }
}