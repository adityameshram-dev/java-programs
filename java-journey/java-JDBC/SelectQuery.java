import java.sql.*;
import java.util.Scanner;

public class SelectQuery {
    public static void main(String[] args) {
        System.out.println("Enter id to find and print data of student");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bittu", "root", "root@2026");
            
            String query = "Select * from student where id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | "
                        + rs.getInt("age") + " | " + rs.getString("grade"));
            } else {
                System.out.println("Record not found..");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
