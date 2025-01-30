
package librarymanage;


import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Connect {
  
    public static Connection getConnection()
    {
          Connection con=null;
      
        try { 
            Class.forName("com.mysql.jdbc.Driver");
           // Class.forName("org.mysql.JDBC");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/library management","root","");
           // con=(Connection) DriverManager.getConnection("jdbc:mysql:stock_db.db");
           
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    
           
      
        
          return con;    
        
    }
    
    
}
