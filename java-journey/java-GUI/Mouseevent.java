import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Mouseevent {
    public static void main(String[] args) {

        JFrame f = new JFrame("Mouse Event");
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel(" ");
        JLabel l2 = new JLabel(" ");
        JButton b1 = new JButton("submit");

        f.add(l1);
        f.add(l2);
        f.add(b1);

        f.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                l1.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
            public void mousePressed(MouseEvent e) {
                l1.setText("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
            }
            public void mouseReleased(MouseEvent e) {
                l1.setText("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
            }
            public void mouseEntered(MouseEvent e) {
                l1.setText("Mouse Entered!");
                b1.setBackground(Color.GREEN);
            }
            public void mouseExited(MouseEvent e) {
                l1.setText("Mouse Exited!");
                b1.setBackground(Color.RED);
            }
        });

        f.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                l2.setText("Moving at X: " + e.getX() + " Y: " + e.getY());
            }
            public void mouseDragged(MouseEvent e) {
                l2.setText("Dragging at X: " + e.getX() + " Y: " + e.getY());
            }
        });

        f.setVisible(true);
        f.setSize(250,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
