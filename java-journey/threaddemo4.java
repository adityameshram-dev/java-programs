// This program demonstrates synchronization to avoid conflict between threads while printing tables.

class printtable {
    synchronized void table(int n) {
        for(int i=1;i<=10;i++) {
            System.out.println(n*i);
        }
    }
}
class thread3 extends Thread {
    printtable t;
    thread3(printtable t) {
        this.t = t;
    }
    public void run() {
        t.table(5);
    }
}
class thread4 extends Thread {
    printtable t;
    thread4(printtable t) {
        this.t = t;
    }
    public void run() {
        t.table(6);
    }
}
public class threaddemo4 {

    public static void main(String[] args) {
        printtable p = new printtable();
        thread3 t1 = new thread3(p);
        thread4 t2 = new thread4(p);
        t1.start();
        t2.start();
    }
}