// Create a login page and verify username and password by using database.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Que38 {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Username: ");
        JTextField t1 = new JTextField(10);
        JLabel l2 = new JLabel("Password: ");
        JPasswordField t2 = new JPasswordField(10);
        JButton b = new JButton("Submit");
        JLabel l3 = new JLabel(" ");

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.add(l3);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bittu", "root",
                            "root@2026");

                    String u = t1.getText();
                    String p = new String(t2.getPassword());

                    String query = "SELECT username, pass FROM users WHERE username = ? and pass = ?";

                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, u);
                    ps.setString(2, p);

                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        l3.setText("Login");
                    } else {
                        l3.setText("not login");
                    }
                    ps.close();
                    rs.close();
                    con.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        f.setVisible(true);
        f.setSize(250, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
