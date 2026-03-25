public class pra4_1 {
    public static void main(String[] args) {
        String str = "heLLO";

        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.substring(2,4));
        System.out.println(str.isEmpty()); // String str = "";
        System.out.println(str.concat(" world"));
        System.out.println(str.replace('H','O'));
        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf('H' ,1));
        System.out.println(str.indexOf("ell"));
        System.out.println(str.indexOf("lo",2));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
// Aditya Meshram
