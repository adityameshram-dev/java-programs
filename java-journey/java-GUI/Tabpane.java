import java.awt.*;
import javax.swing.*;

public class Tabpane {
    public static void main(String[] args) {

        JFrame f = new JFrame("Tabbed Panes");
        f.setLayout(new FlowLayout());

        JTabbedPane tp = new JTabbedPane(JTabbedPane.TOP);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        JButton l1 = new JButton("home tab button");
        JButton l2 = new JButton("bittu tab button");
        p1.add(l1);
        p2.add(l2);

        tp.addTab("home", p1);
        tp.addTab("bittu", p2);
        
        f.add(tp);

        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
