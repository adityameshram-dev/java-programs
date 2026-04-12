// Write a program to list five states using JcomboBox. Display selected item in JTextfield.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Que24 {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());

        String[] state = {"maharashtra","goa","UP","MP","Bihar"};
        JComboBox<String> cb = new JComboBox<>(state);

        JTextField ta = new JTextField(10);
        f.add(cb);
        f.add(ta);
        
        cb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                ta.setText(e.getItem().toString());
            }
        });
        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
