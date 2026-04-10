// Thread Priority in Multithreading

public class threaddemo7 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + " is running " + getPriority());
        }
    }

    public static void main(String[] args) {
        threaddemo7 t1 = new threaddemo7();
        threaddemo7 t2 = new threaddemo7();
        threaddemo7 t3 = new threaddemo7();

        t1.setName("Thread_1");
        t2.setName("Thread_2");
        t3.setName("Thread_3");

        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.MIN_PRIORITY); // 01
        t3.setPriority(Thread.NORM_PRIORITY); // 05

        t1.start();
        t2.start();
        t3.start();
    }
}

/* Thread priority is used to indicate the importance of a thread. */
// A thread with higher priority is given more preference by the CPU scheduler. 
// However, it does not guarantee that the thread will execute first or more frequently,
// as thread scheduling depends on the operating system.