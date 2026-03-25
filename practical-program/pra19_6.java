import javax.swing.*;
public class pra19_6 {
    public static void main(String[] args){
        String[] columns = {"Name", "Percentage", "Grade"};
        Object[][] data = {
            {"Amit Sharma",    92.5, "A+"},
            {"Priya Patel",    85.0, "A"},
            {"Rahul Verma",    78.3, "B+"},
            {"Sneha Gupta",    95.0, "A+"},
            {"Karan Singh",    65.7, "C+"},
            {"Pooja Mehta",    88.2, "A"},
            {"Rohit Joshi",    72.4, "B"},
            {"Anjali Das",     55.1, "D"},
            {"Vikram Nair",    80.0, "A"},
            {"Meera Reddy",    91.3, "A+"}
        };
        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        JFrame frame = new JFrame("Student Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
// Aditya