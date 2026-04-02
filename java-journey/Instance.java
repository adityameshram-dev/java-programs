public class Instance {
    int x = 5;  // Instance variable 
    public void method() {
        int x = 10; // local variable
        System.out.println("Local variable: " + x);
    }
    public static void main(String[] args) {
        Instance c = new Instance();
        System.out.println("Instance variable: " + c.x);
        c.method();
    }
}
