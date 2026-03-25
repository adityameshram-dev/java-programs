import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pra21_4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("SWING");
        f.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Name");
        JTextField t1 = new JTextField(10);
        JLabel l2 = new JLabel("Comments");
        JTextArea t2 = new JTextArea(5,9);
        JButton b = new JButton("Button");
        JLabel l3 = new JLabel(" ");
        JLabel l4 = new JLabel(" ");
        JScrollPane sp = new JScrollPane(t2);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(sp);
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l3.setText(t1.getText());
                l4.setText(t2.getText());
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(200,400);
    }
}
// Aditya