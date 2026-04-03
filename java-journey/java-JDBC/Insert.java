// insert row into table

import java.sql.*;

public class Insert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bittu";
        String user = "root";
        String pass = "root@2026";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected..");

            Statement st = con.createStatement();

            String query = "INSERT INTO student (name, age, grade) VALUES ('JAY', 16, '11TH')";
            int rs = st.executeUpdate(query);

            if (rs > 0) {
                System.out.println("Inserted..");
            } else {
                System.out.println("failed to insert");
            }

            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
