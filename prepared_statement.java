package exam;
import java.sql.*;
import java.util.*;
public class prepared_statement {
    public static void main(String[] args) {
        Connection con;
        PreparedStatement pst;
        int ans=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            pst = con.prepareStatement("insert into student(roll_no,name) values(?,?)");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of records");
             int n = sc.nextInt();
             for(int i=1; i<=n; i++)
             {
                 System.out.println("Enter roll no");
                 int  a = sc.nextInt();
                 
                 System.out.println("Enter name ");
                 String b = sc.next();
                 
                 pst.setInt(1, a);
                 pst.setString(2, b);
                 
                 ans += pst.executeUpdate();
                
             }
             System.out.println(ans+"Record inserted");
                    
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
    
}
