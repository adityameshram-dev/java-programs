// This program demonstrates thread creation using Runnable interface with sleep() method.

class demo1 implements Runnable {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(i);
            try {
                Thread.sleep(322);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class threaddemo2 {
    public static void main(String[] args) {
        demo1 r = new demo1();
        Thread t1 = new Thread(r);
        t1.start();
    }
}