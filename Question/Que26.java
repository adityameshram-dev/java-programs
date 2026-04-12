// Write a program to use keylistener to display characters entered by user.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Que26 {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        JLabel l = new JLabel(" ");
        f.add(l);

        f.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                l.setText("key typed " + e.getKeyChar());
            }
        });
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
}
