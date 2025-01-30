
package librarymanage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ChangePass extends javax.swing.JFrame {
    Connection con;
   
    public ChangePass() {
        initComponents();
        this.setLocationRelativeTo(null);
        con=Connect.getConnection();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        hbutton = new javax.swing.JButton();
        jButton2ok = new javax.swing.JButton();
        jTextField1_oemai = new javax.swing.JTextField();
        jTextField2_nemail = new javax.swing.JTextField();
        jPasswordField1_opass = new javax.swing.JPasswordField();
        jPasswordField2_npass = new javax.swing.JPasswordField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.pink);

        hbutton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        hbutton.setForeground(new java.awt.Color(0, 0, 204));
        hbutton.setText("Back");
        hbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hbuttonActionPerformed(evt);
            }
        });

        jButton2ok.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2ok.setForeground(new java.awt.Color(0, 153, 153));
        jButton2ok.setText("OK");
        jButton2ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2okActionPerformed(evt);
            }
        });

        jTextField1_oemai.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jTextField2_nemail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jPasswordField1_opass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jPasswordField2_npass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(115, 4, 4));
        jLabel1.setText("Old Email ID:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(11, 99, 210));
        jLabel2.setText("New Email ID:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("New Password:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 0));
        jLabel4.setText("Old Password:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText(" Password Change");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(hbutton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1_oemai, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addComponent(jPasswordField1_opass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(89, 89, 89))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField2_nemail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)))
                    .addComponent(jPasswordField2_npass, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(85, 85, 85))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2ok)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(hbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1_oemai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2_nemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1_opass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2_npass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2ok)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hbuttonActionPerformed
        this.dispose();
           MainPage mp=new MainPage();
       mp.setVisible(true);
    }//GEN-LAST:event_hbuttonActionPerformed

    private void jButton2okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2okActionPerformed
      String oemail=jTextField1_oemai.getText();
      String nemail=jTextField2_nemail.getText();
      String opass=String.valueOf(jPasswordField1_opass.getPassword());
      String npass=String.valueOf(jPasswordField2_npass.getPassword());
      if(oemail.isEmpty()||nemail.isEmpty()||opass.isEmpty()||npass.isEmpty())
      {
          JOptionPane.showMessageDialog(null,"Entry must not empty");
      }
      else
      {
           PreparedStatement ps;
      ResultSet rs;
      String query="SELECT   `email`, `pass`FROM `registertable` WHERE `email`='"+oemail+"'";
      try{
          ps=con.prepareStatement(query);
          rs=ps.executeQuery(); 
           while(rs.next())
          {
              String omail=rs.getString("email");
              String opas=rs.getString("pass");
              if(oemail.equals(omail)&&opass.equals(opas))
              {
                  Statement st;
                  String Query="UPDATE `registertable` SET `email`='"+nemail+"',`pass`='"+npass+"' WHERE `email`='"+oemail+"'";
                      try{
                      st=con.createStatement();
                      int k=st.executeUpdate(Query);
                      if(k==1)
                      {    
                           JOptionPane.showMessageDialog(null," Password or email change  successfully.");
                           jTextField1_oemai.setText("");
                           jTextField2_nemail.setText("");
                          jPasswordField1_opass.setText("");
                           jPasswordField2_npass.setText("");
                      }
                              else
                      {
                           JOptionPane.showMessageDialog(null," Password or email change not successfully.");
                      }
                      
                  }catch(Exception ex)
                  {
                      System.out.println(ex.getMessage());
                  }
              }
                   else
              {
                  JOptionPane.showMessageDialog(null,"Email or password incorrect");
              }
          }
              }catch(Exception ex)
      {
          System.out.println(ex.getMessage());
      }            
        
         
      }
    

    }//GEN-LAST:event_jButton2okActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton hbutton;
    private javax.swing.JButton jButton2ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1_opass;
    private javax.swing.JPasswordField jPasswordField2_npass;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1_oemai;
    private javax.swing.JTextField jTextField2_nemail;
    // End of variables declaration//GEN-END:variables
}
