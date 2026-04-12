// Create a Jtree with Node has Branches CM, EJ,ME,EE and semester 1 to 6. 

import javax.swing.*;
import javax.swing.tree.*;

public class Que31 {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTree");
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Branches");
        
        String branches[] = {"CM", "EJ", "ME", "EE"};
    
        for (String b : branches) {
            DefaultMutableTreeNode branchNode = new DefaultMutableTreeNode(b);
            for (int i = 1; i <= 6; i++) {
                DefaultMutableTreeNode sem = new DefaultMutableTreeNode("Semester " + i);
                branchNode.add(sem);
            }
            root.add(branchNode);
        }
        
        JTree tree = new JTree(root);
        JScrollPane scroll = new JScrollPane(tree);
        f.add(scroll);
        
        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}