import java.sql.*;
public class pra30 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bittu";
        String user = "root";
        String pass = "root@2026";
         try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM Student";
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("ID | Name | Age | Grade");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " +
                rs.getInt("age") + " | " + rs.getString("grade"));
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
// Aditya
