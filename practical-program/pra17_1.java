import javax.swing.*;
import java.awt.*;

public class pra17_1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(5,5));
        for (int i = 1; i <= 25; i++) {
            JButton button = new JButton("Button " + i);
            f.add(button);
        }

        f.setVisible(true);
        f.setSize(500,500);
    }
}
// Aditya 