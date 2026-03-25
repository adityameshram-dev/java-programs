import java.awt.*;
import javax.swing.*;

public class pra17_3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("GridLayout Demo");
        f.setLayout(new GridLayout(3,3,10,10));
        for (int i = 1; i <= 5; i++) {
            JButton b = new JButton("Button " + i);
            f.add(b);
        }
        f.setVisible(true);
        f.setSize(500, 500);
    }
}
// Aditya