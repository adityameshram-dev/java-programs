package mypackage;

public class p1 {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        try {
            return a / b;
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
}

// in this package i created file that i import in another file