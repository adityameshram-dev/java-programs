class cal {
    protected double len,bre,hei;
    public void accept(double l,double b,double h) {
        this.len = l;
        this.bre = b;
        this.hei = h;
    }
}
public class pra8_4 extends cal {
    public void display() {
        System.out.println("Volume: " + len*bre*hei);
        System.out.println("Area: " + len*bre);
    }
    public static void main(String[] args) {
        pra8_4 p = new pra8_4();
        p.accept(5, 5, 5);
        p.display();
    }
}
//Aditya Meshram