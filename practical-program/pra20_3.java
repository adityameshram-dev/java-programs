import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pra20_3 {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        JTextField tx = new JTextField(25);
        JLabel l1 = new JLabel(" ");
        f.add(tx);
        f.add(l1);
        tx.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                l1.setText("key pressed "+e.getKeyChar());
            }
        });
        f.setVisible(true);
        f.requestFocusInWindow();
        f.setSize(500,400);
    }
}
// Aditya