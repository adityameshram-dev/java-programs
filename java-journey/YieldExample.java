class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println("Even Thread : " + i);
            Thread.yield(); // relinquish control
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 49; i += 2) {
            System.out.println("Odd Thread  : " + i);
            Thread.yield(); // relinquish control
        }
    }
}

public class YieldExample {
    public static void main(String[] args) {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();
        t2.start();
    }
}
