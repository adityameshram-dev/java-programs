/*
    Write a program to use JTextField, JLabel and JButton to add  
    two numbers and display the output. Use Gridlayout.
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Que25 {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setLayout(new GridLayout(4, 4));

        JPanel p = new JPanel();
        JTextField tf = new JTextField(30);
        p.add(tf);
        f.add(p);

        for (int i = 0; i <= 9; i++) {
            JButton b = new JButton(String.valueOf(i));
            f.add(b);
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tf.setText(tf.getText() + b.getText());
                }
            });
        }
        
        JButton plus = new JButton("+");
        JButton equals = new JButton("=");
        f.add(plus);
        f.add(equals);

        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() +plus.getText());
            }
        });

        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] s = tf.getText().split("\\+");
                int sum = 0;
                for (int i = 0; i < s.length; i++) {
                    sum += Integer.parseInt(s[i]);
                }
                tf.setText(String.valueOf(sum));
            }
        });

        f.setVisible(true);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}