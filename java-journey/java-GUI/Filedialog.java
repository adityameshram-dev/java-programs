// use of filedialog

import java.awt.*;
import java.awt.event.*;

public class Filedialog {
    public static void main(String[] args) {

        Frame f = new Frame("FileDialog");
        f.setLayout(new FlowLayout());

        Button b = new Button("Open File");
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileDialog fd = new FileDialog(f, "Select File", FileDialog.LOAD);
                fd.setVisible(true);

                String file = fd.getFile();
                String directory = fd.getDirectory();

                System.out.println("File: " + file);
                System.out.println("Directory: " + directory);
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setSize(400,300);
        f.setVisible(true);
    }
}