import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Itemevent {
    public static void main(String[] args) {

        JFrame f = new JFrame("Item Event");
        f.setLayout(new FlowLayout());

        String[] names = { "Bittu", "Aditya", "Harshal" };
        JComboBox<String> cb = new JComboBox<>(names);

        JLabel l = new JLabel(" ");

        f.add(cb);
        f.add(l);

        cb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l.setText("Status: " + e.getItem().toString());
            }
        });

        f.setVisible(true);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}