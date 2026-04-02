import java.awt.*;
import java.awt.event.*;

public class label {
    public static void main(String[] args) {
        Frame f = new Frame("label example");
        f.setLayout(new FlowLayout());
        Label l1 = new Label("Name: ");
        f.add(l1);
        f.setVisible(true);
        f.setSize(400,400);
        l1.setFont(new Font("serif",Font.BOLD, 20));

        f.addWindowListener (new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
}
