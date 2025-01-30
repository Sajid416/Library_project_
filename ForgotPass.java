
package librarymanage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ForgotPass extends javax.swing.JFrame {
    Connection con;
    public ForgotPass() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        con=Connect.getConnection();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1email = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ntxt = new javax.swing.JTextField();
        stxt = new javax.swing.JTextField();
        etxt = new javax.swing.JTextField();
        atxt = new javax.swing.JTextField();
        jButton1search = new javax.swing.JButton();
        Hbutton = new javax.swing.JButton();
        retrievebutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        passfld = new javax.swing.JTextField();
        clearbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jLabel1email.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1email.setText("Email ID:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your Security Question:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Answer:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UserName:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Your Password:");

        ntxt.setEditable(false);
        ntxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntxtActionPerformed(evt);
            }
        });

        stxt.setEditable(false);
        stxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        etxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        atxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jButton1search.setBackground(new java.awt.Color(0, 0, 204));
        jButton1search.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton1search.setText("Search");
        jButton1search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1searchActionPerformed(evt);
            }
        });

        Hbutton.setBackground(new java.awt.Color(0, 204, 204));
        Hbutton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Hbutton.setText("Back");
        Hbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HbuttonActionPerformed(evt);
            }
        });

        retrievebutton.setBackground(new java.awt.Color(204, 0, 0));
        retrievebutton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        retrievebutton.setText("Retrive");
        retrievebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retrievebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrievebuttonActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Forgot Password");

        passfld.setEditable(false);
        passfld.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        clearbutton.setBackground(new java.awt.Color(51, 255, 51));
        clearbutton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        clearbutton.setText("Clear");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(stxt, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(144, 144, 144)
                                    .addComponent(jLabel1email))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atxt)
                            .addComponent(etxt)
                            .addComponent(ntxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passfld))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1search)
                    .addComponent(retrievebutton))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Hbutton)
                .addGap(36, 36, 36)
                .addComponent(clearbutton)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1email)
                            .addComponent(jButton1search))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(atxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(retrievebutton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(45, 45, 45)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passfld, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hbutton)
                    .addComponent(clearbutton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HbuttonActionPerformed
       this.dispose();
         LoginForm mp=new LoginForm();
       mp.setVisible(true);
    }//GEN-LAST:event_HbuttonActionPerformed

    private void jButton1searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1searchActionPerformed
          
       String email=etxt.getText();
       String query="SELECT  `uname` FROM `registertable` WHERE `email`='"+email+"'";
       if(email.isEmpty())
       {
           JOptionPane.showMessageDialog(null,"Enter your email."); 
       }
       else
       {
           try{
           PreparedStatement ps;
           ResultSet rs;
           ps=con.prepareStatement(query);
           rs=ps.executeQuery();
           while(rs.next())
           {
               ntxt.setText(rs.getString("uname"));
               stxt.setText("What is your nickname.");
           }
           rs.close();
       }catch(Exception ex)
       {
           System.out.println(ex.getMessage());
       }
         
       }
      
        
    }//GEN-LAST:event_jButton1searchActionPerformed

    private void ntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ntxtActionPerformed

    private void retrievebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrievebuttonActionPerformed
     String nickname=atxt.getText();
       String email=etxt.getText();
     String query="SELECT  `pass`,  `Nickname` FROM `registertable` WHERE `email`='"+email+"'";
     if(nickname.isEmpty())
     {
          JOptionPane.showMessageDialog(null,"Please write your answer.");
     }
     else
     {
         try{
           PreparedStatement ps;
           ResultSet rs;
           ps=con.prepareStatement(query);
           rs=ps.executeQuery();
           while(rs.next())
           {
               String nname=rs.getString("Nickname");
               if(nickname.equals(nname))
               {
                  atxt.setText(nname);
                passfld.setText(rs.getString("pass"));
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"Wrong ans!!try again.");
               }
               
           }
           rs.close();
       }catch(Exception ex)
       {
           System.out.println(ex.getMessage());
       }
     
     }
       
    }//GEN-LAST:event_retrievebuttonActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        etxt.setText("");
        ntxt.setText("");
        stxt.setText("");
        atxt.setText("");
        passfld.setText("");
    }//GEN-LAST:event_clearbuttonActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hbutton;
    private javax.swing.JTextField atxt;
    private javax.swing.JButton clearbutton;
    private javax.swing.JTextField etxt;
    private javax.swing.JButton jButton1search;
    private javax.swing.JLabel jLabel1email;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ntxt;
    private javax.swing.JTextField passfld;
    private javax.swing.JButton retrievebutton;
    private javax.swing.JTextField stxt;
    // End of variables declaration//GEN-END:variables
}
