/*
    Write a program to use Label, TextField and Button to create  
    login form. When user clicks the button, login successful/
    unsuccessful message should be displayed.   
*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Que23 {
    public static void main(String[] args) {

        JFrame f = new JFrame("QUE 1");
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Enter your username : ");
        JTextField t1 = new JTextField(10);
        JLabel l2 = new JLabel("Enter your password");
        JPasswordField t2 = new JPasswordField(10);

        JButton b = new JButton("Login");
        JLabel msg = new JLabel(" ");

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.add(msg);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String pass = new String(t2.getPassword());

                if (t1.getText().equals("bittu") && pass.equals("1234")) {
                    msg.setText("login successful");
                } else {
                    msg.setText("login unsuccessful");
                }
            }
        });

        f.setVisible(true);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
