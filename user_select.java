/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;
import java.sql.Array.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;


public class user_select {
    public static void main(String[] args) {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int rno;
    String name;
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        pst = con.prepareStatement("select * from student where roll_no = ?");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enetr the is that you want to search");
        int a = sc.nextInt();
        
        pst.setInt(1, a);
        
        rs = pst.executeQuery();
        while (rs.next())
        {
            rno = rs.getInt(1);
            name = rs.getString(2);
            
            System.out.println("roll no "+rno+"name "+name);
            
        }
        con.close();
        
            
        
    }
    catch(Exception e)
    {
        System.out.println("Error"+e);
    }
    
    }
    
}
