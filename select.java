package exam;
import java.sql.*;

public class select {
    public static void main(String[] args) {
        Connection con;
        Statement st;
        ResultSet rs;
        int rno;
        String name;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            
            st = con.createStatement();
            
            rs= st.executeQuery("select * from student");
            while(rs.next())
            {
                rno = rs.getInt(1);
                name = rs.getString(2);
                System.out.println("Roll no = " +rno+ "name "+name);
            }
            con.close();      
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
    
}
