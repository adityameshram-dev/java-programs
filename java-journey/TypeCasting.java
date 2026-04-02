public class TypeCasting {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int b = 5;
        double a = b;
        System.out.println(a);

        // Explicit Type Casting (Narrowing)
        double x = 5.5;
        int z = (int) x;
        System.out.println(z);
    }
}
