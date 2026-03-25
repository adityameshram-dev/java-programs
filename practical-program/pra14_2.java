import java.awt.*;
import java.awt.event.*;
public class pra14_2 {
    public static void main(String[] args) {
        Frame f = new Frame("AWt example");
        f.setLayout(null);
        Label l1 = new Label("Name: ");
        TextField tf1 = new TextField(20);
        Label l2 = new Label("Address: ");
        TextArea ta1 = new TextArea(20,5);
        Button btn = new Button("submit");
        // add
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(ta1);
        f.add(btn);
        l1.setBounds(200,200,40,40);
        l2.setBounds(200,250,40,40);
        tf1.setBounds(250, 200, 80, 20);
        ta1.setBounds(250,250,180,70);
        btn.setBounds(200,330,50,40);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
        f.setSize(700,700);
    }
}
// Aditya 