// Write a program to display the list of employees of deptno  
// 10 from the table employee (eno, ename, salary, deptno).  
// Use prepared statement.

import java.sql.*;

public class Que39 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bittu",
                "root",
                "root@2026"
            );
            String query = " select * from employee where deptno = ? ";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 10);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getInt("eno") + " | " + rs.getString("ename") + " | " + rs.getInt("salary") + " | " + rs.getInt("deptno"));
            }
            rs.close();
            ps.close();
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
