
package exam;
import java.sql.*;
public class delete {
    public static void main(String[] args) {
        Connection con;
        Statement st;
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
           st = con.createStatement();
           
           int ans  = st.executeUpdate("delete from student where roll_no=1");
            System.out.println(ans+"Record deleted"); 
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
    
}
