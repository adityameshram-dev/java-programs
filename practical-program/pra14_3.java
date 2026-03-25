import java.awt.*;
import java.awt.event.*;
public class pra14_3 {
    public static void main(String[] args) {
        Frame f = new Frame("AWT exapmle");
        Button ok = new Button("OK");
        Button reset = new Button("RESET");
        Button cancel = new Button("CANCEL");
        f.add(ok);
        f.add(reset);
        f.add(cancel);
        ok.setBounds(150,100,40,50);
        reset.setBounds(150,200,40,50);
        cancel.setBounds(150,300,50,50);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);
    }
}
// Aditya
