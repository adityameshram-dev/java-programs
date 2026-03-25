import java.util.Scanner;
import javax.security.sasl.AuthenticationException;
public class pra12_4 {
    public void checked(int pass) {
        try {
            if (pass != 1234) 
                throw new AuthenticationException("Password is Incorrect");
            System.out.println("Password is correct");
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password: ");
        int password = input.nextInt();
        pra12_4 p = new pra12_4();
        p.checked(password);
        input.close();
    }
}
// Aditya Meshram