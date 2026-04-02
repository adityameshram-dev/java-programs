import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rd = new Random();
        int num = rd.nextInt(101);
        System.out.print(num);
    }
}
