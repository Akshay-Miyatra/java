
package exam;
import java.sql.*;

public class create_insert {
    public static void main(String[] args) {
        Connection con;
        Statement st;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            System.out.println("Db coonected");
            
            st = con.createStatement();
            
//            st.execute("create table student(roll_no int,name varchar(20))");
//            System.out.println("table created");
            
            int ans = st.executeUpdate("insert into student values(1,'abc')");
            System.out.println("Record inserted"+ans);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
}
