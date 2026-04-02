public class local {
    void display() {
        int x = 5; // local variable
        System.out.println("Local variable: "+ x);
    }
    public static void main(String[] args) {
        local c = new local();
        c.display();
    }
}
