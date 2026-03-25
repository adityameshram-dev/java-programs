import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pra18_1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        String[] city = { "Solapur", "Pune", "Banglore", "Mumbai" };
        JComboBox<String> jc = new JComboBox<>(city);
        JTextField tx = new JTextField(25);
        f.add(jc);
        f.add(tx);
        jc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tx.setText("You are in " + jc.getSelectedItem());
            }
        });
        f.setVisible(true);
        f.setSize(500, 500);
    }
}
// Aditya