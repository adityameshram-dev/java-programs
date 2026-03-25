import java.util.Scanner;
class A {
    protected int roll;
    protected String name;
    protected void accept(Scanner input) {
        System.out.println("Enter Roll number and name: ");
        roll = input.nextInt();
        name = input.next();
    }
}
class B extends A {
    protected float sub1,sub2,sub3,sub4;
    protected void accept(Scanner input) {
        super.accept(input);
        System.out.println("Enter 4 subject mark: ");
        sub1 = input.nextInt();
        sub2 = input.nextInt();
        sub3 = input.nextInt();
        sub4 = input.nextInt();
    }
}
class C extends B {
    public void display() {
        System.out.println(roll);
        System.out.println(name);
        System.out.println(sub1 + " " + sub2 + " " + sub3 + " " + sub4);
        System.out.println((sub1+sub2+sub3+sub4)/4.0);
    }
}
public class pra8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        C c = new C();
        c.accept(input);
        c.display();
    }
}
// Aditya meshram