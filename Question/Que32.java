// Create a Tabbed Pane with Tab 1 : Flowers , Tab 2 : Animals , Tab 3 : Rivers 
// with content Flower tab , animal tab and river tab

import javax.swing.*;

public class Que32 {
    public static void main(String[] args) {

        JFrame f = new JFrame("JTabbedPane");
        JTabbedPane tp = new JTabbedPane();

        JPanel FP = new JPanel();
        FP.add(new JLabel("This is Flower Tab"));
        tp.addTab("Flowers", FP);

        JPanel AP = new JPanel();
        AP.add(new JLabel("This is Animal Tab"));
        tp.addTab("Animals", AP);

        JPanel RP = new JPanel();
        RP.add(new JLabel("This is River Tab"));
        tp.addTab("Rivers", RP);

        f.add(tp);

        f.setVisible(true);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}