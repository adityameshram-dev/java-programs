public class pra11_5 extends Thread {
    public void run() {
        System.out.println("run call by " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        pra11_5 th1 = new pra11_5();
        pra11_5 th2 = new pra11_5();
        pra11_5 th3 = new pra11_5();
        th1.setName("thread1");
        th2.setName("thread2");
        th3.setName("thread3");
        th1.setPriority(1);
        th2.setPriority(5);
        th3.setPriority(10);
        th1.start();
        th2.start();
        th3.start();
    }
}
// Aditya Meshram