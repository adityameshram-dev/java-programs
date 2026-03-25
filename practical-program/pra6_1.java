public class pra6_1 {
    public static void main(String[] args) {
        Integer i = 300;
        Integer j = 200;
        
        String s = "200";
        int a = Integer.parseInt(s);      // String to primitive int
        System.out.println("Parsed int from String: " + a);
        String str = i.toString();        // Integer to String
        System.out.println(str + 7);
        System.out.println(i.equals(j));  // Check if two Integer objects have same value (boolean)
        System.out.println(i.compareTo(j)); // Compare two Integer objects: >0 if i>j, <0 if i<j, 0 if equal
        System.out.println(Integer.valueOf(i));  // Returns Integer object of given value
    }
}
// Aditya Meshram
