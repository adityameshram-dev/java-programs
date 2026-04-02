// Area of rectangle using abstract class

import java.util.Scanner;

abstract class Area {
    protected int len, bre;

    public void accept(Scanner input) {
        System.out.println("Enter lenght and bredth: ");
        len = input.nextInt();
        bre = input.nextInt();
    }
    public abstract void display();
}

public class Rectangle extends Area {
    public void display() {
        System.out.println("Area of rectangle : " + len * bre);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle c = new Rectangle();
        c.accept(input);
        c.display();
    }
}
