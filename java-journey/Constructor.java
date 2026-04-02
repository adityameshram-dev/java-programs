import java.util.Scanner;

class student {
    private String name;

    public student() {
        System.out.println("Hi i'm constructor and you ? ");
        Scanner input = new Scanner(System.in);
        name = input.next();
        input.close();
    }
    public void display() {
        System.out.println("nice to meet you " + name);
    }
}

public class Constructor {
    public static void main(String[] args) {
        student s = new student();
        s.display();
    }
}