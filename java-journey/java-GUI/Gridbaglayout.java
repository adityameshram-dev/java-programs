// use of gridbaglayout manager

import java.awt.*;
import java.awt.event.*;

public class Gridbaglayout {
    public static void main(String[] args) {

        Frame f = new Frame("GridBagLayout");
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        f.setLayout(gbl);

        Button b1 = new Button("button1");
        Button b2 = new Button("button1");
        Button b3 = new Button("button1");

        gbc.gridx = 0;
        gbc.gridy = 0;
        f.add(b1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        f.add(b2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 200;
        f.add(b3, gbc);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setSize(500, 500);
        f.setVisible(true);
    }
}