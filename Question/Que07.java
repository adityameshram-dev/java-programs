// types of constructors in Java with suitable example.

class student {
    int roll;
    String name;
    student() {
        System.out.println("Default Constructor");
    }
    student(int roll,String name) {
        this.roll = roll;
        this.name = name;
    }
    student(student s) {
        roll = s.roll;
        name = s.name;
    }
    void display() {
        System.out.println(name + " " + roll);
    }
}
public class Que07 {
    public static void main(String[] args) {
        student s1 = new student(); // Default constructor
        student s2 = new student(45,"Bittu"); // Parameterized constructor
        student s3 = new student(s2); // Copy constructor
        s1.display();
        s2.display();
        s3.display();
    }    
}
