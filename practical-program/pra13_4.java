class NotMatchstrException extends Exception {
    NotMatchstrException (String n) {
        super(n);
    }
}
public class pra13_4 {
    public void check (String str) {
        try {
            if(!(str.equals("India")))
                throw new NotMatchstrException("not match");
            System.out.println("match");
        } catch(NotMatchstrException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        pra13_4 p = new pra13_4();
        p.check("Indi");
    }
}
// Aditya Meshran