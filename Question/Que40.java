// Write a program to display the details of all students having 
// percentage greater than 75 (use prepared statement) Consider the details :
// Student (rollno, sname, branchcode, perc)

import java.sql.*;

public class Que40 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bittu","root","root@2026");

            String query = "select * from Student where perc > ?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,75);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.println(rs.getInt("rollno") + " | " + rs.getString("sname") + " | " + 
            rs.getString("branchcode") + " | " + rs.getFloat("perc"));
            }
            rs.close();
            ps.close();
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
