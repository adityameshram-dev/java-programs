import java.util.Vector;

public class vector2 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3,7);
        v.add(0);
        v.add(1);
        v.add(2);
        System.out.println(v.capacity());
        v.add(3);
        System.out.println(v.capacity());
        v.remove(0);
        for(int i:v) {
            System.out.println(i);
        }
    }
}