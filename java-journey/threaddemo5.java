// This program creates a thread using Runnable interface and prints numbers with delay.

public class threaddemo5 implements Runnable {
    public void run() {
        for(int i=0;i<=500;i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("error");
            }
        }
    }
    public static void main(String[] args) {
        threaddemo5 t6 = new threaddemo5();
        Thread t1 = new Thread(t6);
        t1.start();
    }
}