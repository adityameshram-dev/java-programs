import java.awt.*;
import java.awt.event.*;

public class Menubar1 {
    public static void main(String[] args) {
        Frame f = new Frame("AWT");
        f.setLayout(new FlowLayout());

            MenuBar mb = new MenuBar();
            f.setMenuBar(mb);           // it create a menu baar line

            Menu file = new Menu("File");
            mb.add(file);               // it write a file name on line

            MenuItem mi = new MenuItem("New");
            MenuItem mi1 = new MenuItem("Open");
            MenuItem mi2 = new MenuItem("Save");
            MenuItem mi3 = new MenuItem("Save as");

            file.add(mi);
            file.add(mi1);
            file.add(mi2);
            file.add(mi3);

            f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

            f.setVisible(true);
            f.setSize(300,300);
    }
}