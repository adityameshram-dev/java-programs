// Write a program to change the background colour of applet to red when user clicks the ‘Change color’ button.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Que28 {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.getContentPane().setBackground(Color.BLACK);

        JButton b = new JButton("Change color");
        b.setForeground(Color.white);
        b.setBackground(Color.BLUE);

        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.getContentPane().setBackground(Color.RED);
            }
        });

        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }    
}
