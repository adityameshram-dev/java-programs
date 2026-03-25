import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.*;
public class pra19_5 {
    public static void main(String[] args) {
        File root = new File("/");
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(root.getAbsolutePath());
        File[] subFolders = root.listFiles(File::isDirectory);
        if (subFolders != null) {
            for (File folder : subFolders) {
                rootNode.add(new DefaultMutableTreeNode(folder.getName()));
            }
        }
        JTree tree = new JTree(rootNode);
        JScrollPane scrollPane = new JScrollPane(tree);
        JFrame frame = new JFrame("JTree - Root Directory");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
// Aditya 