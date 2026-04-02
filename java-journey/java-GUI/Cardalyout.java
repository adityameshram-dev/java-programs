// use of cardlayout manager

import java.awt.*;
import java.awt.event.*;

public class Cardalyout {
    public static void main(String[] args) {

        Frame f = new Frame("CardLayout");
        f.setLayout(new FlowLayout());

        Panel p1 = new Panel();
        p1.setLayout(new CardLayout());

        Panel sp1 = new Panel();
        sp1.setLayout(new FlowLayout());
        Label spl1 = new Label("Name");
        TextField spt1 = new TextField(20);
        sp1.add(spl1);
        sp1.add(spt1);

        Panel sp2 = new Panel();
        sp2.setLayout(new FlowLayout());
        Button spb1 = new Button("ok");
        Button spb2 = new Button("cancle");
        sp2.add(spb1);
        sp2.add(spb2);

        p1.add("Text",sp1);
        p1.add("Button",sp2);

        Choice ch = new Choice();
        ch.add("Text");
        ch.add("Button");
        
        f.add(ch);
        f.add(p1);

        ch.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                CardLayout crd = (CardLayout)(p1.getLayout());
                crd.show(p1,(String)e.getItem());   
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setSize(400,400);
        f.setVisible(true);
    }
}
