// Area of circle using interface

interface  Calculation {
    public abstract void get(int r);
    public abstract void display();
}
public class Cricle implements Calculation {
    int r;
    public void get(int r) {
        this.r = r;
    }
    public void display() {
        System.out.println("Area is : " + (3.14*r*r));
    }
    public static void main(String[] agrs) {
        Cricle c = new Cricle();
        c.get(5);
        c.display();
    }
}
