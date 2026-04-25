abstract class Vehicle {
    abstract public void Break();
    abstract public void Acclerate();
    public void bittu() {
        System.out.println("Bittu method");
    }
}
class TwoWheel extends Vehicle {
    public void Break() {
        System.out.println("brake");
    }
    public void Acclerate() {
        System.out.println("Acclerate");
    }
}
public class AbstractClass  {
    public static void main(String[] args) {
        TwoWheel tw = new TwoWheel();
        tw.Acclerate();
        tw.Break();
        tw.bittu();
    }
}
