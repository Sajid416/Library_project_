
package librarymanage;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class RenewBook extends javax.swing.JFrame {
    Connection con;
  
    public RenewBook() {
        initComponents();
          this.setLocationRelativeTo(null);
          con=Connect.getConnection();
          
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1stid = new javax.swing.JTextField();
        jTextField2stname = new javax.swing.JTextField();
        jTextField3stcon = new javax.swing.JTextField();
        jTextField4bid = new javax.swing.JTextField();
        jTextField5bname = new javax.swing.JTextField();
        jDateChooser1issue = new com.toedter.calendar.JDateChooser();
        jDateChooser2return = new com.toedter.calendar.JDateChooser();
        jTextField6issnum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Renew Book");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Student ID:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("StudentName:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Contact No:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("BookName:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Issue date:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Return date:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("IssueNum:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Book ID:");

        jTextField1stid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField1stid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1stidKeyPressed(evt);
            }
        });

        jTextField2stname.setEditable(false);
        jTextField2stname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTextField3stcon.setEditable(false);
        jTextField3stcon.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTextField4bid.setEditable(false);
        jTextField4bid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTextField5bname.setEditable(false);
        jTextField5bname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jDateChooser1issue.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jDateChooser2return.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTextField6issnum.setEditable(false);
        jTextField6issnum.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Renew");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2back.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2back.setText("Back");
        jButton2back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton1)
                        .addGap(51, 51, 51)
                        .addComponent(jButton2back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1stid)
                            .addComponent(jTextField2stname)
                            .addComponent(jTextField3stcon)
                            .addComponent(jTextField4bid)
                            .addComponent(jTextField5bname)
                            .addComponent(jDateChooser1issue, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jDateChooser2return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField6issnum))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1stid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2stname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3stcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField4bid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField5bname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1issue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jDateChooser2return, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6issnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2back))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1stidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1stidKeyPressed
        
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         {
             
          if(jTextField1stid.getText().isEmpty())
          {
              JOptionPane.showMessageDialog(null,"Please enter student id");
          }
          
          else
               {
                 int stdid=Integer.parseInt(jTextField1stid.getText());  
                 PreparedStatement ps;
                 ResultSet rs;
                 String query="SELECT * FROM `issuebook` ";
                 try{
                     ps=con.prepareStatement(query);
                     rs=ps.executeQuery();
                     int s=0;
                     while(rs.next())
                     {
                        
                        int sid=rs.getInt("Student ID");  
                         if(sid==stdid)
                         {  
                             s++;
                             break;
                             
                         }
                     }
                     if(s==0)
                     {
                         JOptionPane.showMessageDialog(null,"This student id is not issued");
                     }
                     else
                     {   
                          int sid=rs.getInt("Student ID");                          
                         String snm=rs.getString("StudentName");
                         String con=rs.getString("Contact No");
                         int id=rs.getInt("BookID");
                         String bname=rs.getString("BookName");
                         /* SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
                            String issuedate=dateformat.format(rs.getDate("Issue Date"));
                          SimpleDateFormat Dateformat=new SimpleDateFormat("yyyy-MM-dd");
                           String returndate=Dateformat.format(rs.getDate("ReturnDate"));
                           System.out.println(rs.getDate("ReturnDate"));
                           */
                         int issnm=rs.getInt("IssueNum");
                         jTextField1stid.setText(String.valueOf(sid));
                             jTextField2stname.setText(snm);
                             jTextField3stcon.setText(con);
                             jTextField4bid.setText(String.valueOf(id));
                             jTextField5bname.setText(bname);                           
                           jDateChooser1issue.setDate(rs.getDate("Issue Date"));
                           jDateChooser2return.setDate(rs.getDate("ReturnDate"));
                           jTextField6issnum.setText(String.valueOf(issnm));
                         
                     }
                     
                 }catch(Exception ex)
                 {
                     System.out.println(ex.getMessage());
                 }
                   
               }
            
             
         }
     
    }//GEN-LAST:event_jTextField1stidKeyPressed

    private void jButton2backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2backActionPerformed
          this.dispose();
      MainPage mp=new MainPage();
      mp.setVisible(true);
    }//GEN-LAST:event_jButton2backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        
         if(jTextField1stid.getText().isEmpty())
         {
             JOptionPane.showMessageDialog(null,"Please enter your id");
         }
         else
         {
                int stid=Integer.parseInt(jTextField1stid.getText());
         SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
          String issuedate=dateformat.format(jDateChooser1issue.getDate());
           SimpleDateFormat Dateformat=new SimpleDateFormat("yyyy-MM-dd");
           String returndate=Dateformat.format(jDateChooser2return.getDate());
          int issnm=Integer.parseInt(jTextField6issnum.getText());
          PreparedStatement ps;
          String query="UPDATE `issuebook` SET`Issue Date`='"+issuedate+"',`ReturnDate`='"+returndate+"',`IssueNum`='"+issnm+"' WHERE `Student ID`='"+stid+"'";
          try{
              
             ps=con.prepareStatement(query);
             int k=ps.executeUpdate();
             if(k==1)
             {
                 
                JOptionPane.showMessageDialog(null,"Book renew successful");
                jTextField1stid.setText("");
                jTextField2stname.setText("");
                jTextField3stcon.setText("");
                jTextField4bid.setText("");
                 jTextField5bname.setText("");                           
                jDateChooser1issue.setDateFormatString("");
                 jDateChooser2return.setDateFormatString("");
                jTextField6issnum.setText("");
                 
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"Book renew is not successful");
             }
              
          }catch(Exception ex)
          {
              System.out.println(ex.getMessage());
          } 
         }
     
   
    }//GEN-LAST:event_jButton1ActionPerformed

  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RenewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2back;
    private com.toedter.calendar.JDateChooser jDateChooser1issue;
    private com.toedter.calendar.JDateChooser jDateChooser2return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1stid;
    private javax.swing.JTextField jTextField2stname;
    private javax.swing.JTextField jTextField3stcon;
    private javax.swing.JTextField jTextField4bid;
    private javax.swing.JTextField jTextField5bname;
    private javax.swing.JTextField jTextField6issnum;
    // End of variables declaration//GEN-END:variables
}
