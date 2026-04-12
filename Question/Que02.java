// explain type casting in java with example

public class Que02 {
    public static void main(String[] args) {
        int a = 5;
        float b = a; // Widening casting
        System.out.println(b);

        float c = 5.5f;
        int d = (int) c; // Narrowing casting
        System.out.println(d);
    }    
}
