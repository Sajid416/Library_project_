
package librarymanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Showdata {
     Connection con=null; 
    Showdata()
    {
          
         show();
    }
    public void show()
    {
        
         PreparedStatement ps;
        ResultSet rs;
        String query="SELECT * FROM ttable";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/rocky","root","");
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next())
            {
                
                String uname=rs.getString("uname");
                String email=rs.getString("email");
                System.out.println(uname);
                  System.out.println(email);
            }
            ps.close();
            con.close();
        } catch (Exception ex) {
            System.out.println("succss");
        }
        
        
        
    }
       
    
    
    public static void main(String[]args)
    {
           
    Showdata s=new Showdata();
    
     
        
      
    }
   
    }
    

