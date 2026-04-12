// Write a program to show the use of copy constructor

public class Que08 {
    int roll;
    String name;
    Que08() { }
    Que08(Que08 q) {
        roll = q.roll;
        name = q.name;
    }
    void display() {
        System.out.println(name + " " + roll);
    }
    public static void main(String[] args) {
        Que08 q = new Que08();
        q.roll = 45;
        q.name = "bittu";
        q.display();
        Que08 q1 = new Que08(q);
        q1.display();
    }    
}
