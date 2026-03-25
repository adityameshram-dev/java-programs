import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pra22_4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("SWING");
        f.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("number 1");
        JTextField t1 = new JTextField(14);
        JLabel l2 = new JLabel("number 2");
        JTextField t2 = new JTextField(14);
        JLabel result = new JLabel(" ");
        JButton b = new JButton("Add");
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(result);
        f.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                result.setText(Integer.toString(a + b));
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(250, 300);
    }
}
// Aditya 