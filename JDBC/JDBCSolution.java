import java.sql.*;

public class JDBCSolution {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","password");
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS employee(id INT, name VARCHAR(50), salary DOUBLE)");
        st.executeUpdate("INSERT INTO employee VALUES(1,'Ayu',50000)");

        ResultSet rs = st.executeQuery("SELECT * FROM employee WHERE salary>30000");
        while(rs.next()){
            System.out.println(rs.getString("name"));
        }
        con.close();
    }
}
