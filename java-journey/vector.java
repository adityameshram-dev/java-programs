import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        System.out.println(v);
        v.remove(3);
        System.out.println(v);
        v.add(3,40);
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.elementAt(2));
        System.out.println(v.get(0));
    }
}
