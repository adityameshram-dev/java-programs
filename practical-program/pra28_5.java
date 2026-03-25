import java.sql.*;

public class pra28_5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bittu";
        String user = "root";
        String pass = "root@2026";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            System.out.println("Connected Successfully!");

            String update = "DELETE FROM STUDENT WHERE ID = 1";
            stmt.executeUpdate(update);
            System.out.println("Record UPDATE successfully.");
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
// Aditya
