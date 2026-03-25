import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class pra20_4 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        JLabel l1 = new JLabel(" ");
        JLabel l2 = new JLabel(" ");
        
        f.add(l1);
        f.add(l2);

        f.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                l2.setText("Moving at X: " + e.getX() + " Y: " + e.getY());
            }
            public void mouseDragged(MouseEvent e) {
                l2.setText("Dragging at X: " + e.getX() + " Y: " + e.getY());
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250,400);
        f.setVisible(true);
    }
}
// Aditya 