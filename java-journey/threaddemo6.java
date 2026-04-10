// join() in Thread

public class threaddemo6 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + (i + 1));
        }
    }
    public static void main(String[] args) {
        threaddemo6 t1 = new threaddemo6();
        threaddemo6 t2 = new threaddemo6();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.setName("Th1");
        th2.setName("Th2");

        try {
            th1.start();
            th1.join();     // join() pauses the calling thread until the target thread finishes execution

            th2.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
