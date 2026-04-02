// odd and even number using runnable interface 

class even1 implements Runnable {
    public void run() {
        for(int i=0;i<=100;i+=2) {
            System.out.println("Even number:" + i);
        }
    }
}
class odd1 implements Runnable {
    public void run() {
        for(int i=1;i<=100;i+=2) {
            System.out.println("Odd number:" + i);
        }
    }
}
public class threaddemo {
    public static void main(String[] args) {
        even1 r1 = new even1();
        odd1 r2 = new odd1();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
