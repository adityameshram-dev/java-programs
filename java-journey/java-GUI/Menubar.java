// use of menubars and menus

import java.awt.*;
import java.awt.event.*;

public class Menubar {
    public static void main(String[] args) {

        Frame f = new Frame("MENUS");
        MenuBar mb = new MenuBar();
        f.setMenuBar(mb);

        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        mb.add(file);
        mb.add(edit);

        MenuItem open = new MenuItem("open");
        MenuItem save = new MenuItem("save");

        file.add(open);
        edit.add(save);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
        f.setSize(400,400);
    }
}
