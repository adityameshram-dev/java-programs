import javax.swing.*;
import java.awt.*;

public class jcombox {
    public static void main(String[] args) {
        JFrame f = new JFrame("JCombox");
        f.setLayout(new FlowLayout());
        Integer[] sem = { 1, 2, 3, 4, 5, 6 };
        JComboBox<Integer> jb = new JComboBox<>(sem);
        f.add(jb);
        f.setVisible(true);
        f.setSize(400, 400);
    }
}
