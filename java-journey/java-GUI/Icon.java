// use of icon 

import javax.swing.*;
import java.awt.*;

public class Icon {
    public static void main(String[] args) {

        JFrame f = new JFrame("Icon");
        f.setLayout(new FlowLayout());

        ImageIcon i = new ImageIcon("java.png");
        JButton b = new JButton(i);

        f.add(b);
        
        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}