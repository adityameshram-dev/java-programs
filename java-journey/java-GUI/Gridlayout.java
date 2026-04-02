// use of gridlayout manager

import java.awt.*;
import java.awt.event.*;

public class Gridlayout {
    public static void main(String[] args) {

        Frame f = new Frame("GridLayout");
        f.setLayout(new GridLayout(3,3,10,10));

        f.add(new Button("1"));
        f.add(new Button("2"));
        f.add(new Button("3"));
        f.add(new Button("4"));
        f.add(new Button("5"));
        f.add(new Button("6"));
        f.add(new Button("7"));
        f.add(new Button("8"));
        f.add(new Button("9"));

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setSize(200, 200);
        f.setVisible(true);
    }
}
