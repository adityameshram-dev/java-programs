import java.sql.*;

public class Showdatabases {
    public static void main(String[]args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root@2026");
        Statement st = con.createStatement();
        String query = "SHOW DATABASES";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getString(1));            
        }
        rs.close();
        st.close();
        con.close();
    }
}
