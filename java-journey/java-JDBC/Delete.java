import java.sql.*;

public class Delete {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bittu","root","root@2026");
        System.out.println("Connected..");

        Statement st = con.createStatement();
        String query = "delete from student where id = 4";
        int rs = st.executeUpdate(query);
        if(rs>0) {
            System.out.println("deleted..");
        } else {
            System.out.println("failed..");
        }
        st.close();
        con.close();
    }    
}
