import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Keyevent {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Enter name");
        JTextField l2 = new JTextField(40);
        JLabel t1 = new JLabel("");

        f.add(l1);
        f.add(l2);
        f.add(t1);

        l2.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                t1.setText("key pressed "+KeyEvent.getKeyText(e.getKeyCode()));
            }
            public void keyTyped(KeyEvent e) {
                t1.setText("key typed "+e.getKeyChar());
            }
            public void keyReleased(KeyEvent e) {
                t1.setText("key released "+KeyEvent.getKeyText(e.getKeyCode()));
            }
        });
        
        f.setVisible(true);
        f.requestFocusInWindow();
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// NOTE
// KeyTyped only characters
// KeyPressed and KeyReleased for All keys
