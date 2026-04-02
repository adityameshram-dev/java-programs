public class Static {
    static double PI = 3.14; // static variable
    float r = 5.5f;
    void display() {
        System.out.println("AREA of a CIRCLE: " + (PI*r*r));
    }
    public static void main(String[] args)  {
        Static c = new Static();
        c.display();
    }
}
