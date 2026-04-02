// use of checkbox and checkboxgroup

import java.awt.*;
import java.awt.event.*;

public class Check {
    public static void main(String[] args) {

        Frame f = new Frame("Checkbox");
        f.setLayout(new FlowLayout());

        Label l1 = new Label("select how many laguage you know");
        Checkbox c1 = new Checkbox("java");
        Checkbox c2 = new Checkbox("python");

        Label l2 = new Label("select gender");
        CheckboxGroup group = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("Male", group, false);
        Checkbox cb2 = new Checkbox("Female", group, false);

        f.add(l1);
        f.add(c1);
        f.add(c2);
        f.add(l2);
        f.add(cb1);
        f.add(cb2);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
        f.setSize(300, 200);
    }
}