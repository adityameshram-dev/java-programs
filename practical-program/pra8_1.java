class single {
    void display() {
        System.out.println("parent class");
    }
}
public class pra8_1 extends single {
    void display() {
        System.out.println("child class");
    }
    public static void main(String[] args) {
        single s = new pra8_1();
        s.display();
        s = new single();
        s.display();
    }
}
// Aditya Meshram