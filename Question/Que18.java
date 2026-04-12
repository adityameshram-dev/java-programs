// Define exception called ‘No Match Exception’ that is thrown 
// when the password accepted is not equal to ‘MSBTE’. Write the program.

import java.util.Scanner;

class NoMatchException extends Exception {
    NoMatchException(String msg) {
        super(msg);
    }
}

public class Que18 {
    public static void checkpassword(String pass) throws NoMatchException{
        if(!(pass.equals("MSBTE"))) {
            throw new NoMatchException("Not valid password");
        }
        System.out.println("Password is valid");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        String pass = sc.next();
        try {
            checkpassword(pass);
        } catch(NoMatchException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }        
}
