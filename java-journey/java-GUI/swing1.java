import java.awt.*;
import javax.swing.*;
public class swing1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Example");
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Enter name");

        ImageIcon icon = new ImageIcon("java.png");
        JLabel l2 = new JLabel(icon);

        TextField t1 = new TextField(20);

        /*JComboBox<Integer> cb = new JComboBox<>();
        cb.addItem(1);
        cb.addItem(2);
        cb.addItem(3);
        cb.addItem(4);
        cb.addItem(5);
        cb.addItem(6);*/

        Integer[] sem = {1,2,3,4,5,6};
        JComboBox<Integer> cb = new JComboBox<>(sem);
        
        JButton b1 = new JButton("ok");

        JCheckBox c1 = new JCheckBox("python");
        JCheckBox c2 = new JCheckBox("java");
        ButtonGroup bg = new ButtonGroup();
        bg.add(c1);
        bg.add(c2);

        JRadioButton r1 = new JRadioButton("male");
        JRadioButton r2 = new JRadioButton("female");

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);

        f.add(l1);
        f.add(t1);
        f.add(cb);
        f.add(b1);
        f.add(c1);
        f.add(c2);
        f.add(r1);
        f.add(r2);
        f.add(l2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setSize(400,400);
        f.setVisible(true);
    }
}