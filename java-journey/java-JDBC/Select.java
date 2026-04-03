import java.sql.*;

public class Select {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bittu", "root", "root@2026");

        Statement st = con.createStatement();
        String query = "select * from student";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " 
                                + rs.getInt("age") + " | " + rs.getString("grade"));
        }
        rs.close();
        st.close();
        con.close();
    }
}
