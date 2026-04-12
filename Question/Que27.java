// Write a program to demonstrate the use of Grid layout.

import javax.swing.*;
import java.awt.*;

public class Que27 {
    public static void main(String[] args) {

        JFrame f = new JFrame("GridLayout");
        f.setLayout(new GridLayout(3, 3, 10, 10));

        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
        f.add(new JButton("7"));
        f.add(new JButton("8"));
        f.add(new JButton("9"));

        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
}
