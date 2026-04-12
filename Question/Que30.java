/*
    Write a program to display a button with an image on it using Swing. The image on the 
    button will change when the button is clicked.
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Que30 {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());

        ImageIcon i1 = new ImageIcon("java.png");
        ImageIcon i2 = new ImageIcon("python.png");
        JButton b1 = new JButton(i1);

        f.add(b1);

        b1.addActionListener(new ActionListener() {
            boolean flag = true;
            public void actionPerformed(ActionEvent e) {
                if (flag) {
                    b1.setIcon(i2);
                    flag = false;
                } else {
                    b1.setIcon(i1);
                    flag = true;
                }
            }
        });

        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
}
