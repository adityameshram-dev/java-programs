/*
    Write a program to accept two numbers in Textfield and 
    display their product in a third Textfield when the user checks 
    “Multiply” button.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Que29 {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Enter 1st number: ");
        JTextField t1 = new JTextField(10);
        JLabel l2 = new JLabel("Enter 2nd number: ");
        JTextField t2 = new JTextField(10);
        JButton b = new JButton("Multiply");
        JTextField t3 = new JTextField(10);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.add(t3);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(n1*n2));
            }
        });

        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(3);
    }
}
