public class login {
    public void checked(int pass) {
        try {
            if (pass != 1234) {
                throw new Exception("incorrect password");
            } else {
                System.out.println("log in");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        login l = new login();
        l.checked(1234);
    }
}