import java.awt.*;
import java.awt.event.*;
public class pra14_4 {
    public static void main(String[] args) {
        Frame f = new Frame("AWT example");
        f.setLayout(new FlowLayout());
        List l = new List(10, false);
        String[] str = {"Mumbai","Nagpur","Bhandara","Nashik",
        "Pune","Dhule","Dharashiv","Nanded","Beed","Jalgaon"};
        for (String city : str) {
            l.add(city);
        }
        f.add(l);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
        f.setSize(400, 400);
    }
}
// Aditya 