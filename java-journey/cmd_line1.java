
public class cmd_line1 {
    public static void main(String [] args) {
        String n = args[0];
        Integer num = Integer.parseInt(n);
        System.out.println("Square of " + num + " is " + num*num);
        System.out.println("Square root of " + num + " is " + Math.sqrt(num));
    }
}