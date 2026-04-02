// odd and even number using Thread Class

class even extends Thread {
    public void run() {
        for(int i=0;i<=100;i+=2) {
            System.out.println("Even number:" + i);
        }
    }
}
class odd extends Thread {
    public void run() {
        for(int i=1;i<=100;i+=2) {
            System.out.println("Odd number:" + i);
        }
    }
}
public class threaddemo1 {
    public static void main(String[] args) {
        even t1 = new even();
        odd t2 = new odd();
        t1.start();
        t2.start();

    }
}