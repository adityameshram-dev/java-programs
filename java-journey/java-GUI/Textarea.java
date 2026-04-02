import java.awt.*;
import java.awt.event.*;

public class Textarea {
    public static void main(String[] args) {
        Frame f = new Frame("TextArea");
        f.setLayout(new FlowLayout());

        Label l1 = new Label("Enter Address");
        TextArea ta1 = new TextArea(4,20);

        f.add(l1);
        f.add(ta1);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        f.setSize(400,400);
        f.setVisible(true);
    }
}
