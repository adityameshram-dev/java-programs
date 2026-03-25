class NotMatchException extends Exception {
    NotMatchException (String n) {
        super(n);
    }
}
public class pra13_3 {
    public void check(int num) {
        try {
            if(num!=123) 
                throw new NotMatchException("number is not match");
            System.out.println("number is match");
        } catch(NotMatchException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        pra13_3 p = new pra13_3();
        p.check(153);
    }
}
// Aditya Meshram