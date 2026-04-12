/*
Write a Java program in which thread A will display the even 
numbers between 1 to 50 and thread B will display the odd 
numbers between 1 to 50. After 3 iterations thread A should  
go to sleep for 500 ms.
*/

class A extends Thread {
    public void run() {
        int count = 0;
        for (int i = 1; i <= 50; i++) {
            try {
                if (i % 2 == 0) {
                    System.out.println(i);
                    count++;
                }
                if (count==3) {
                    count = 0;
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
                if (i % 2 == 1)
                    System.out.println(i);
        }
    }
}

public class Que22 {
    public static void main(String[] args) {
        A ThreadA = new A();
        B ThreadB = new B();
        ThreadA.start();
        ThreadB.start();
    }
}
