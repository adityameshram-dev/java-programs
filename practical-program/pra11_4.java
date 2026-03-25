class thread5 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread 1 is running..");
        }
    }
}
class thread6 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread 2 is running..");
        }
    }
}
public class pra11_4 {
    public static void main(String[] args) {
        thread5 t1 = new thread5();
        thread6 t2 = new thread6();
        t1.start();
        t2.start();
    }
}
// Aditya Meshram