import java.sql.*;
import java.util.Scanner;

public class Createtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Table name to create: ");
        String tablename = sc.next();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bittu","root","root@2026");
             String sql = "CREATE TABLE " + tablename + " ( " +
                         "id INT PRIMARY KEY AUTO_INCREMENT, " +
                         "name VARCHAR(50) NOT NULL UNIQUE, " +
                         "age INT NOT NULL " +
                         "); ";         
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            if(n==0) {
                System.out.println("Table created..");
            } else {
                System.out.println("Table not created..");
            }
            
            ps.close();
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }    
}
