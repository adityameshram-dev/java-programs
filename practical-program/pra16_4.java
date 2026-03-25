import javax.swing.*;
import java.awt.*;

public class pra16_4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Borderlayout");
        f.setLayout(new BorderLayout());

        JButton l1 = new JButton("north");
        JButton l2 = new JButton("east");
        JButton l3 = new JButton("west");
        JButton l4 = new JButton("south");
        JButton l5 = new JButton("centre");

        f.add(l1, BorderLayout.NORTH);
        f.add(l2, BorderLayout.EAST);
        f.add(l3, BorderLayout.WEST);
        f.add(l4, BorderLayout.SOUTH);
        f.add(l5, BorderLayout.CENTER);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
// Aditya 