/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;
import java.sql.*;
import java.util.*;
public class user_delete {
    public static void main(String[] args) {
        Connection con;
        PreparedStatement pst;
        int ans;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            pst = con.prepareStatement("delete from student where roll_no=?");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            pst.setInt(1, a);
            ans = pst.executeUpdate();
            System.out.println(ans+"record deleted");
            
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
    
}
