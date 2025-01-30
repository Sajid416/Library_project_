
package librarymanage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import sun.util.logging.PlatformLogger;


public class RegisterForm extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement ps;
 
    public RegisterForm() {
        super("register Form");
        initComponents();
        this.setLocationRelativeTo(null);
        con=Connect.getConnection();
     
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_fN = new javax.swing.JTextField();
        regcancelb = new javax.swing.JButton();
        registerbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPasswordField1repass = new javax.swing.JPasswordField();
        jTextField_LN = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_address = new javax.swing.JTextArea();
        labellogin = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1nm = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1email = new javax.swing.JTextField();
        jTextField2uname = new javax.swing.JTextField();
        jPasswordField2pass = new javax.swing.JPasswordField();

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Click here to create new account");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 42, 77));

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Register Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(17, 22, 22));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Retype pass:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name:");

        jTextField_fN.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_fN.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        regcancelb.setBackground(new java.awt.Color(245, 8, 57));
        regcancelb.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        regcancelb.setText("Cancel");
        regcancelb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regcancelbActionPerformed(evt);
            }
        });

        registerbutton.setBackground(new java.awt.Color(0, 153, 153));
        registerbutton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        registerbutton.setText("Register");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("First Name:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email ID :");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Address:");

        jPasswordField1repass.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1repass.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jTextField_LN.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_LN.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jTextArea1_address.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1_address.setColumns(20);
        jTextArea1_address.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextArea1_address.setRows(5);
        jScrollPane1.setViewportView(jTextArea1_address);

        labellogin.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        labellogin.setForeground(new java.awt.Color(255, 255, 255));
        labellogin.setText("Click here to login");
        labellogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labellogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelloginMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Birth Date:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("NickName:");

        jTextField1nm.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1nm.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jDateChooser1.setBackground(new java.awt.Color(204, 204, 204));

        jTextField1email.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1email.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jTextField2uname.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2uname.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jPasswordField2pass.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField2pass.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addComponent(jLabel8))
                                .addGap(2, 2, 2))
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_LN, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                .addComponent(jTextField_fN))
                            .addComponent(jTextField1nm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(labellogin, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(regcancelb)
                                .addGap(52, 52, 52)
                                .addComponent(registerbutton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField2uname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                .addComponent(jTextField1email, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPasswordField2pass, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPasswordField1repass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_fN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_LN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField1nm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField1email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2uname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField2pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1repass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regcancelb)
                    .addComponent(registerbutton))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labellogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        RegisterForm rgf=new  RegisterForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }                                    

    private void regcancelbActionPerformed(java.awt.event.ActionEvent evt) {                                           
     System.exit(0);
    }                                          

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                               
            
            if(jTextField_fN.getText().isEmpty()||jTextField1nm.getText().isEmpty()||jTextField_LN.getText().isEmpty()||jPasswordField1repass.getPassword().equals("")||jTextArea1_address.getText().isEmpty()||jDateChooser1.getDate().toString().isEmpty())
            {
                 JOptionPane.showMessageDialog(null,"Entry must not empty"); 
            }
           
             else if(jTextField1email.getText().isEmpty())
            {
                 JOptionPane.showMessageDialog(null,"Please enter email id"); 
            }
              else if(jTextField2uname.getText().isEmpty())
            {
                 JOptionPane.showMessageDialog(null,"Please enter username"); 
            }
             else if(jPasswordField2pass.getPassword().toString().isEmpty())
            {
                 JOptionPane.showMessageDialog(null,"Please enter password"); 
            }
         //else if(!jPasswordField1repass.getPassword().equals(passfield.getPassword()))
            else if(jPasswordField2pass.getPassword().equals(jPasswordField1repass.getPassword()))
            {
                 JOptionPane.showMessageDialog(null,"Wrong repassword"); 
            }
           
            else if(checkU_name(jTextField2uname.getText()))
            {
                 JOptionPane.showMessageDialog(null,"User name already exist"); //jPasswordField1repass.getPassword()
            }
                else if(checkemail(jTextField1email.getText()))
            {
                 JOptionPane.showMessageDialog(null,"Email already exist"); 
            }
            
            
            else
             {
            String f_name=jTextField_fN.getText();
            String l_name=jTextField_LN.getText();
            String nickn=jTextField1nm.getText();
            String email=jTextField1email.getText();
            String U_name=jTextField2uname.getText();
            String pass=String.valueOf(jPasswordField2pass.getPassword());
            String repass=String.valueOf(jPasswordField1repass.getPassword()); 
            SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
            String bdate=dateformat.format(jDateChooser1.getDate());            
            String address=jTextArea1_address.getText();
                 try {
               String query="INSERT INTO `registertable`(`fname`, `lname`,`email`,`uname`, `pass`, `address`,`Nickname`) VALUES (?,?,?,?,?,?,?)"; 
              ps=con.prepareStatement(query);
              ps.setString(1,f_name);
              ps.setString(2,l_name);
              ps.setString(3,email);
              ps.setString(4,U_name);
              ps.setString(5,pass);           
              ps.setString(6, address);
              ps.setString(7,nickn);
            int k=ps.executeUpdate();
            if(k==1)
            {
             JOptionPane.showMessageDialog(null,"New account created");
             jTextField_fN.setText("");
             jTextField_LN.setText("");
             jTextField1nm.setText("");
             jTextField1email.setText("");
             jTextField2uname.setText("");
             jPasswordField2pass.setText("");
             jPasswordField1repass.setText("");             
             jDateChooser1.setDateFormatString("");
             jTextArea1_address.setText("");
             
            }
            
              ps.close();
              rs.close();         
            
              
          } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
          }  
             }          
           
        
    }                                              

    private void labelloginMouseClicked(java.awt.event.MouseEvent evt) {                                        
        LoginForm lgf=new   LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }                                       
      public boolean  checkU_name(String username)
      { 
            ResultSet rs;
            PreparedStatement ps;
              boolean checkUser=false;
           String query="SELECT* FROM `registertable` WHERE `uname`=?";
            
          try{
        
             
              ps=con.prepareStatement(query);
              ps.setString(1,username);
              rs=ps.executeQuery();
              if(rs.next())
              {
                  
                  checkUser=true;
              }
              
          }catch(Exception e)
          {
             JOptionPane.showMessageDialog(null, e);
          }
         
            return checkUser;    
            } 
        public boolean  checkemail(String uemail)
      { 
            ResultSet rs;
            PreparedStatement ps;
              boolean checkemail=false;
           String query="SELECT* FROM `registertable` WHERE `email`=?";
            
          try{
        
             
              ps=con.prepareStatement(query);
              ps.setString(1,uemail);
              rs=ps.executeQuery();
              if(rs.next())
              {
                  
                 checkemail=true;
              }
              
          }catch(Exception e)
          {
             JOptionPane.showMessageDialog(null, e);
          }
         
            return checkemail;    
            } 
   
   
    public static void main(String args[]) {
    
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField1repass;
    private javax.swing.JPasswordField jPasswordField2pass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1_address;
    private javax.swing.JTextField jTextField1email;
    private javax.swing.JTextField jTextField1nm;
    private javax.swing.JTextField jTextField2uname;
    private javax.swing.JTextField jTextField_LN;
    private javax.swing.JTextField jTextField_fN;
    private javax.swing.JLabel labellogin;
    private javax.swing.JButton regcancelb;
    private javax.swing.JButton registerbutton;
    // End of variables declaration                   
}
