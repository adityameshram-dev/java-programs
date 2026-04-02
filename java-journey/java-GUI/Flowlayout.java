// use of flowlayout manager

import java.awt.*;
import java.awt.event.*;

public class Flowlayout {
    public static void main(String[] args) {

        Frame f = new Frame("FlowLayout");
        f.setLayout(new FlowLayout(300));

        f.add(new Checkbox("java"));
        f.add(new Checkbox("python"));
        f.add(new Checkbox("cpp"));

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setSize(400, 500);
        f.setVisible(true);
    }
}
