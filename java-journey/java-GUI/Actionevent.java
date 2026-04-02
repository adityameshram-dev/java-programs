import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Actionevent {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());

        JButton b = new JButton("Clicked me");
        JLabel l = new JLabel(" ");
        
        f.add(b);
        f.add(l);
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Button is clicked");
            }
        });
        
        f.setVisible(true);;
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}