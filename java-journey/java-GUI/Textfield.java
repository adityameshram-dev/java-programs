import java.awt.*;
import java.awt.event.*;

public class Textfield {

    public static void main(String[] args) {

        Frame f = new Frame("TextField");
        f.setLayout(new FlowLayout());

        Label l1 = new Label("Username: ");
        Label l2 = new Label("password");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        t2.setEchoChar('*');

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)  {
                System.exit(0);
            }
        });

        f.setVisible(true);
        f.setSize(300,300);
    }
}