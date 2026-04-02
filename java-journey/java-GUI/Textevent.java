import java.awt.*;
import java.awt.event.*;

public class Textevent {
    public static void main(String[] args) {

        Frame f = new Frame();
        f.setLayout(new FlowLayout());

        Label l1 = new Label("Enter name");
        Label l2 = new Label(" ");

        TextField ta = new TextField(20);
        TextField ta1 = new TextField(40);

        f.add(l1);
        f.add(ta);
        f.add(ta1);
        f.add(l2);

        ta.addTextListener(new TextListener() {
            public void textValueChanged(TextEvent e) {
                ta1.setText(ta.getText());
            }
        });

        ta1.addTextListener(new TextListener() {
            public void textValueChanged(TextEvent e) {
                String text = ta1.getText();
                l2.setText("Characters: " + text.length());
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        f.setSize(400, 400);
        f.setVisible(true);
    }
}