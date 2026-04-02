// use of borderlayout manager

import java.awt.*;
import java.awt.event.*;

public class Borderlayout {
    public static void main(String[] args) {

        Frame f = new Frame("Borderlayout");
        f.setLayout(new BorderLayout(10, 10));

        Button b1 = new Button("north");
        Button b2 = new Button("east");
        Button b3 = new Button("west");
        Button b4 = new Button("south");
        Button b5 = new Button("centre");

        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.EAST);
        f.add(b3, BorderLayout.WEST);
        f.add(b4, BorderLayout.SOUTH);
        f.add(b5, BorderLayout.CENTER);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setSize(300, 300);
        f.setVisible(true);
    }
}
