import java.sql.*;

public class Update {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bittu","root","root@2026");
            System.out.println("Connected..");

            Statement st = con.createStatement();

            String query = "update student set age = 20 where id = 2";

            int rs = st.executeUpdate(query);
            if(rs>0) {
                System.out.println("updated...");
            } else {
                System.out.println("failed..");
            }
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
