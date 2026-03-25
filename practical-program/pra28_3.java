import java.sql.*;

public class pra28_3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bittu";
        String user = "root";
        String pass = "root@2026";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            System.out.println("Connected Successfully!");

            String insertRecord = "INSERT INTO Student (name, age, grade) "
                    + "VALUES ('Bittu Meshram', 19, '2nd')";
            stmt.executeUpdate(insertRecord);
            System.out.println("Record inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// Aditya
