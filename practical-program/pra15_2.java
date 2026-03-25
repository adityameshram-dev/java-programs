import java.awt.*;
import java.awt.event.*;
public class pra15_2 {
    public static void main(String[] args) {
        Frame f = new Frame("AWT");
        f.setLayout(new FlowLayout());
        MenuBar mb = new MenuBar();
        f.setMenuBar(mb);
        Menu m = new Menu("Color");
        mb.add(m);
        MenuItem mi = new MenuItem("red");
        MenuItem mi1 = new MenuItem("blue");
        MenuItem mi2 = new MenuItem("green");
        MenuItem mi3 = new MenuItem("black");
        m.add(mi);
        m.add(mi1);
        m.add(mi2);
        m.add(mi3);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
        f.setSize(300, 300);
    }
}
// Aditya