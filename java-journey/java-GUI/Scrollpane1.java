import javax.swing.*;
import java.awt.*;
public class Scrollpane1 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Swing");

        f.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Enter name");
        JTextArea ta = new JTextArea(5,20);
        JScrollPane sp = new JScrollPane(ta);
        f.add(l1);
        f.add(sp);

        f.setSize(300,200);
        f.setVisible(true);
    }
}