public class Array1 {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d%8d%n", i, a[i]);
        }
    }
}
