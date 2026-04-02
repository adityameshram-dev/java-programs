import javax.swing.*;
import javax.swing.tree.*;

public class Tree {
    public static void main(String[] args) {

        JFrame f = new JFrame("Tree");

        // Main root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("India");

        // Child of root node
        DefaultMutableTreeNode MH = new DefaultMutableTreeNode("Maharshtra");
        DefaultMutableTreeNode UP = new DefaultMutableTreeNode("Uttar Pradesh");

        // grant child of root node
        MH.add(new DefaultMutableTreeNode("Nagpur"));
        UP.add(new DefaultMutableTreeNode("Agra"));

        // Tree structure connect
        root.add(MH);
        root.add(UP);

        JTree t = new JTree(root);
        f.add(t);

        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}