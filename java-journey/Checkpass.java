// user define exeception 

import java.util.Scanner;

class checkpassword extends Exception {
    checkpassword(String msg) {
        super(msg);
    }
}

public class Checkpass {
    static void checck(int pass) {
        try {
            if (pass == 124578) {
                System.out.println("phone are open");
            } else {
                throw new checkpassword("password is not right");
            }
        } catch (checkpassword e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        int i=1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter password: ");
            int pass = sc.nextInt();
            checck(pass);
            i++;
        } while(i<=3);
        sc.close();
    }
}
