// This program creates two threads to print multiplication tables concurrently.

class thread1 extends Thread {
    int n;
    thread1 (int n) {
        this.n=n;
    }
    public void run() {
        for(int i = 1;i<=10;i++) {
            System.out.println(i*n);
        }
    }
}
class thread2 extends Thread {
    int n;
    thread2 (int n) {
        this.n=n;
    }
    public void run() {
        for(int i = 1;i<=10;i++) {
            System.out.println(i*n);
        }
    }
}
public class threaddemo3 {
    public static void main(String[] args) {
       thread1 t1 = new thread1(10);
       thread2 t2 = new thread2(20);
       t1.start();
       t2.start();
    }
}