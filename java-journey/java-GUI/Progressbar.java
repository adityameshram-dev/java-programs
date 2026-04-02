import javax.swing.*;
import java.awt.*;

public class Progressbar {
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Progress Bar");
        f.setLayout(new FlowLayout());
        
        JProgressBar pb = new JProgressBar(0, 100);
        pb.setStringPainted(true);
        
        f.add(pb);
        f.setSize(300, 200);
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        for (int i = 0; i <= 100; i++) {
            pb.setValue(i);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}