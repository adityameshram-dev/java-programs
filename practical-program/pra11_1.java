class thread implements Runnable {
    String s;
    public thread(String s) {
        this.s = s;
    }
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                System.out.println(s);
                Thread.sleep(1234);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class pra11_1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new thread("Aditya"));
        Thread t2 = new Thread(new thread("Meshram"));
        t1.start();
        t2.start();
    }
}
// Aditya Meshram
