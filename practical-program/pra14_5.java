import java.awt.*;
import java.awt.event.*;
public class pra14_5 {
    public static void main(String[] args) {
        Frame f = new Frame("AWT example");
        f.setLayout(new FlowLayout());

        List l = new List(5,true);
        String[] str = {"The Hindu","Times of India","Indian Express","Lokmat","Sakal"};
        for (String newspaper: str) {
            l.add(newspaper);
        }
        f.add(l);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
        f.setSize(400,400);
    }
}
// Aditya 
