import javax.swing.*;
import java.awt.*;

public class Tooltip {
    public static void main(String[] args) {

        JFrame f = new JFrame("ToolTip Example");
        f.setLayout(new FlowLayout());

        JButton b = new JButton("Submit");
        b.setToolTipText("Click this button to submit");

        f.add(b);

        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
// Tooltip: A small popup message that appears when you hover over a component.