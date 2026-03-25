import java.awt.*;
import java.awt.event.*;
public class pra14_1 {
    public static void main(String[] args) {
        Frame f = new Frame("AWT example");
        f.setLayout(new FlowLayout());
        // Checkbox
        Label l1 = new Label("how many laguage you know");
        Checkbox c1 = new Checkbox("Java",false);
        Checkbox c2 = new Checkbox("Python",false);
        Checkbox c3 = new Checkbox("c",false);
        Checkbox c4 = new Checkbox("C++",false);
        // CheckboxGroup
        Label l6 = new Label("Select Gender: ");
        CheckboxGroup cg = new CheckboxGroup();
        Checkbox cl1 = new Checkbox("Male",cg,false);
        Checkbox cl2 = new Checkbox("Female",cg,false);
        // add 
        f.add(l1);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.add(l6);
        f.add(cl1);
        f.add(cl2);        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
        f.setSize(400,300);
    }
}
// Aditya
