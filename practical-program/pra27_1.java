import java.sql.*;
public class pra27_1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bittu";
        String user = "root";
        String pass = "root@2026";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            System.out.println("Connected Successfully!");
            String createTable = "CREATE TABLE IF NOT EXISTS Student ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "name VARCHAR(50),"
                    + "age INT,"
                    + "grade VARCHAR(10)"
                    + ")";
            stmt.executeUpdate(createTable);
            System.out.println("Student table created successfully.");
            String insertRecord = "INSERT INTO Student (name, age, grade) "
                    + "VALUES ('Aditya Meshram', 17, '12th')";
            stmt.executeUpdate(insertRecord);
            System.out.println("Record inserted successfully.");
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } // Aditya
    }
}
