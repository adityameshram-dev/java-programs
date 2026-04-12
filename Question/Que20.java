// Write a program to print even and odd number using two  
// threads with delay of 1000 ms after each number.

class evennumber extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            try {
                if (i % 2 == 0)
                    System.out.println(i);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}

class oddnumber extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            try {
                if (i % 2 == 1)
                    System.out.println(i);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}

public class Que20 {
    public static void main(String[] args) {
        oddnumber od = new oddnumber();
        evennumber ev = new evennumber();
        od.start();
        ev.start();
    }
}
