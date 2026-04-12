/* Write a program to create two threads. One thread will display 
the numbers from 1 to 50 (ascending order) and other thread will 
display numbers from 50 to 1 (descending order). */

class asc implements Runnable {
    public void run() {
        for (int i = 1; i<=50; i++) {
            System.out.println("Ascending: "+i);
        }
    }
}
class des implements Runnable {
    public void run() {
        for(int i = 50;i>=1;i--) {
            System.out.println("Descending: "+i);
        }
    }
}

public class Que21 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new asc());
        Thread t2 = new Thread(new des());
        t1.start();
        t2.start();
    }
}