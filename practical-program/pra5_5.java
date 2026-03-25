import java.util.Vector;
public class pra5_5 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        System.out.println(v.firstElement());
        System.out.println(v.getLast());
        System.out.println(v.get(2));
        v.remove(3);
        System.out.println(v.capacity());
        for (int i:v) {
            System.out.println(i);
        }
    }
}
// Aditya Meshram