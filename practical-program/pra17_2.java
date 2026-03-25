import java.awt.*;
import javax.swing.*;

public class pra17_2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(3, 3));
        for (int i = 0; i <= 9; i++) {
            JButton b = new JButton("" + i);
            f.add(b);
        }
        f.setVisible(true);
        f.setSize(500, 500);
    }
}
// Aditya