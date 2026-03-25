public class pra4_2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");

        System.out.print(str.append(" World"));
        System.out.println(str.insert(1,"bittu"));
        System.out.println(str.replace(1, 4, " bittu "));
        System.out.println(str.delete(1,4));
        System.out.println(str.reverse());
        System.out.println(str.capacity());
        System.out.println(str.charAt(1));
        System.out.println(str.length());
    }
}
// Aditya Meshram