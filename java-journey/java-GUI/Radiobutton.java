import java.awt.*;
import javax.swing.*;

public class Radiobutton {
    public static void main(String[] args) {
        
        JFrame f = new JFrame("JRadioButton");
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Select your gender");
        JRadioButton r1 = new JRadioButton("male");
        JRadioButton r2 = new JRadioButton("female");
        JRadioButton r3 = new JRadioButton("other");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        f.add(l1);
        f.add(r1);
        f.add(r2);
        f.add(r3);

        f.setVisible(true);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}