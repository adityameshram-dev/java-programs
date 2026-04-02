import java.awt.*;
import javax.swing.*;

public class Combo {
    public static void main(String[] args) {
        
        JFrame f = new JFrame("JComboBox");
        f.setLayout(new FlowLayout());

        String[] branch = {"CM","ME","EE","CE"};
        JComboBox<String> cb = new JComboBox<>(branch);

        f.add(cb);

        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
