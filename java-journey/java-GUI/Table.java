import javax.swing.*;

public class Table {
    public static void main(String[] args) {

        JFrame f = new JFrame("JTable Example");
        String column[] = {"Roll No", "Name", "Marks"};
        String data[][] = {
                {"1", "Rahul", "80"},
                {"2", "Amit", "75"},
                {"3", "Sneha", "90"},
                {"4", "Priya", "85"}
        };

        JTable jt = new JTable(data, column);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}