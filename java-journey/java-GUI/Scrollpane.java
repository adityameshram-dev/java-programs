import java.awt.*;
import javax.swing.*;

public class Scrollpane {
    public static void main(String[] args) {

        JFrame f = new JFrame("Scroll");
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Enter Address");
        JTextArea t1 = new JTextArea(5,20);

        JScrollPane jc = new JScrollPane(t1);

        f.add(l1);
        f.add(jc);
        
        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
