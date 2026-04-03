import java.sql.*;

public class Showtable {
    public static void main(String[]args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bittu","root","root@2026");
        Statement st = con.createStatement();
        String query = "SHOW TABLES";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getString(1));            
        }
        rs.close();
        st.close();
        con.close();
    }
}
