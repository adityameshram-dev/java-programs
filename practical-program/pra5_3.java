import java.util.Vector;

public class pra5_3 {
    public static void main(String[] args) {
        Vector<Object> v1 = new Vector<>();
        v1.add("hi");
        v1.add("bittu");
        v1.add(90.35);
        for (int i = 0; i < v1.size(); i++) {
            System.out.println(v1.get(i));
        }
    }
}
// Aditya Meshram