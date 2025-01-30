package librarymanage;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class IssueBook11 extends javax.swing.JFrame {

    Connection con;

    public IssueBook11() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = Connect.getConnection();
    }
    public void data(int q,int i)
    {   
          int id = Integer.parseInt(jTextField2id.getText());
       String stn =jTextField3stun.getText();
        String contact=jTextField4contac.getText();
        int bid=Integer.parseInt(jTextField1bid.getText());
        String bookname=jTextField1bn.getText();
        int numofb=Integer.parseInt(jTextField2bn.getText());
        SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
        String issuedate=dateformat.format(jDateChooser1issue.getDate());
        SimpleDateFormat Dateformat=new SimpleDateFormat("yyyy-MM-dd");
        String returndate=Dateformat.format(jDateChooser2return.getDate());
        if(numofb>0&&numofb<=q-i)
        {
           PreparedStatement ps;
           String query="INSERT INTO `issuebook`(`Student ID`, `StudentName`, `Contact No`, `BookName`, `Issue Date`, `ReturnDate`, `IssueNum`, `BookID`) VALUES (?,?,?,?,?,?,?,?)";
           try{
               
               ps=con.prepareStatement(query);
               ps.setInt(1,id);
               ps.setString(2,stn);
               ps.setString(3,contact);               
               ps.setString(4,bookname);
               ps.setString(5,issuedate);
               ps.setString(6,returndate);
               ps.setInt(7,numofb);
               ps.setInt(8,bid);
              
             
               int k=ps.executeUpdate();
               if(k==1)
               {
                   JOptionPane.showMessageDialog(null,"Book issue successfull");
                   jTextField2id.setText("");
                   jTextField3stun.setText("");
                   jTextField4contac.setText("");
                   jTextField1bid.setText("");
                   jTextField1bn.setText("");
                   jTextField2bn.setText("");
                   jDateChooser1issue.setDateFormatString("");
                   jDateChooser2return.setDateFormatString("");
               }
               else
               {
                 JOptionPane.showMessageDialog(null,"Book issue is not successfull");  
               }
               
               
           }catch(Exception ex)
           {
               System.out.println(ex.getMessage());
           }
           
           
           
        }
        else
        {
              JOptionPane.showMessageDialog(null,"This number of books are not available"); 
        }
         
        
        
}
    public void insertdata(int q)
    {
         int id = Integer.parseInt(jTextField2id.getText());
       String stn =jTextField3stun.getText();
        String contact=jTextField4contac.getText();
        int bid=Integer.parseInt(jTextField1bid.getText());
        String bookname=jTextField1bn.getText();
        int numofb=Integer.parseInt(jTextField2bn.getText());
        SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
        String issuedate=dateformat.format(jDateChooser1issue.getDate());
        SimpleDateFormat Dateformat=new SimpleDateFormat("yyyy-MM-dd");
        String returndate=Dateformat.format(jDateChooser2return.getDate());
        if(numofb>0&&numofb<=q)
        {
           PreparedStatement ps;
           String query="INSERT INTO `issuebook`(`Student ID`, `StudentName`, `Contact No`, `BookName`, `Issue Date`, `ReturnDate`, `IssueNum`, `BookID`) VALUES (?,?,?,?,?,?,?,?)";
           try{
               
               ps=con.prepareStatement(query);
               ps.setInt(1,id);
               ps.setString(2,stn);
               ps.setString(3,contact);              
               ps.setString(4,bookname);
               ps.setString(5,issuedate);
               ps.setString(6,returndate);
               ps.setInt(7,numofb);
               ps.setInt(8,bid);
               
               
               int k=ps.executeUpdate();
               if(k==1)
               {
                   JOptionPane.showMessageDialog(null,"Book issue successfull");
                    jTextField2id.setText("");
                   jTextField3stun.setText("");
                   jTextField4contac.setText("");
                   jTextField1bid.setText("");
                   jTextField1bn.setText("");
                   jTextField2bn.setText("");
                   jDateChooser1issue.setDateFormatString("");
                   jDateChooser2return.setDateFormatString("");
               }
               else
               {
                 JOptionPane.showMessageDialog(null,"Book issue is not successfull");  
               }
               
               
           }catch(Exception ex)
           {
               System.out.println(ex.getMessage());
           }
           
           
           
        }
        else
        {
              JOptionPane.showMessageDialog(null,"This books are not available"); 
        }
         
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2id = new javax.swing.JTextField();
        jTextField3stun = new javax.swing.JTextField();
        jTextField4contac = new javax.swing.JTextField();
        jButton1issue = new javax.swing.JButton();
        bbutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1bn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1bid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField2bn = new javax.swing.JTextField();
        jDateChooser1issue = new com.toedter.calendar.JDateChooser();
        jDateChooser2return = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("Issue Book");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Student ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Student Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Student Contact:");

        jTextField2id.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField2id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2idKeyReleased(evt);
            }
        });

        jTextField3stun.setEditable(false);
        jTextField3stun.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jTextField4contac.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jButton1issue.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1issue.setText("Issue Book");
        jButton1issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1issueActionPerformed(evt);
            }
        });

        bbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bbutton.setText("Back");
        bbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuttonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Book Name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Issue Date:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Return Date:");

        jTextField1bn.setEditable(false);
        jTextField1bn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Book ID:");

        jTextField1bid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField1bid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1bidKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Numofbooks:");

        jTextField2bn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1issue)
                        .addGap(30, 30, 30)
                        .addComponent(bbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2id, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTextField3stun)
                            .addComponent(jTextField4contac)
                            .addComponent(jTextField1bid)
                            .addComponent(jTextField1bn)
                            .addComponent(jTextField2bn)
                            .addComponent(jDateChooser1issue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser2return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField3stun, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4contac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1bid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1bn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2bn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jDateChooser1issue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jDateChooser2return, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1issue)
                    .addComponent(bbutton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1issueActionPerformed
     
        if(jTextField2id.getText().isEmpty()||jTextField3stun.getText().isEmpty()||jTextField4contac.getText().isEmpty()||jTextField1bid.getText().isEmpty()||jTextField1bn.getText().isEmpty()||jDateChooser1issue.getDateFormatString().isEmpty()||jDateChooser2return.getDateFormatString().isEmpty())
        {
           JOptionPane.showMessageDialog(null,"Entry must not empty.");
        }
        else
        {
            
           int id = Integer.parseInt(jTextField2id.getText());
       String stn =jTextField3stun.getText();
        String contact=jTextField4contac.getText();
        int bid=Integer.parseInt(jTextField1bid.getText());
        String bookname=jTextField1bn.getText();
        int numofb=Integer.parseInt(jTextField2bn.getText());
        SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
        String issuedate=dateformat.format(jDateChooser1issue.getDate());
        SimpleDateFormat Dateformat=new SimpleDateFormat("yyyy-MM-dd");
        String returndate=Dateformat.format(jDateChooser2return.getDate());
           PreparedStatement ps;
           ResultSet rs;
           int s=0;
           String query="SELECT * FROM `newbook`";
           try{
               ps=con.prepareStatement(query);
               rs=ps.executeQuery();
               while(rs.next())
               {
                   int ddid=rs.getInt("BookID");
                   if(ddid==bid)
                   {
                         int quanti=rs.getInt("Quantity");
                         PreparedStatement pt;
                         ResultSet st;
                         String Query="SELECT * FROM `issuebook`";
                         try{
                             pt=con.prepareStatement(Query);
                             st=pt.executeQuery();
                             while(st.next())
                             {
                                 int ide=st.getInt("BookID");
                                 if(ide==bid)
                                 {
                                     int issnum=st.getInt("IssueNum");
                                     s=s+issnum;
                                     
                                 }
                             }
                             if(s==0)
                             {
                               insertdata(quanti);  
                             }
                             else
                             {
                                  data(quanti,s); 
                             }
                           
                             
                         }catch(Exception ex)
                         {
                            System.out.println(ex.getMessage());
                         }
                         break;
                         
                   }
               }
             
               
               
           }catch(Exception ex)
           {
               System.out.println(ex.getMessage());
           }
           
            
            
        }

    }//GEN-LAST:event_jButton1issueActionPerformed

    private void bbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbuttonActionPerformed
        this.dispose();
        MainPage mp = new MainPage();
        mp.setVisible(true);
    }//GEN-LAST:event_bbuttonActionPerformed

    private void jTextField2idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2idKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER)
    {
        
        
        
        if (jTextField2id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Student id field is empty");
        } else {
              int id = Integer.parseInt(jTextField2id.getText());
            PreparedStatement ps;
            ResultSet rs;
            int s = 0;
            String query = "SELECT * FROM `stuent register`";
            try {
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int ide = rs.getInt("Student ID");
                    if (id == ide) {
                        s++;
                        jTextField3stun.setText(rs.getString("Name"));
                        break;
                    }
                }
                if (s == 0) {
                    JOptionPane.showMessageDialog(null, "This student is not registered");
                    jTextField2id.setText("");
                    jTextField3stun.setText("");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        
        
        
        
        
        
        
        
    }

    }//GEN-LAST:event_jTextField2idKeyPressed

    private void jTextField2idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2idKeyReleased


    }//GEN-LAST:event_jTextField2idKeyReleased

    private void jTextField1bidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1bidKeyPressed
      
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         {
             
             
           if (jTextField1bid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Book id field is empty.");
        } else {
            PreparedStatement ps;
            ResultSet rs;
            int s = 0;
            String query = "SELECT * FROM `newbook`";
            try {
                int id = Integer.parseInt(jTextField1bid.getText());
                int studentid=Integer.parseInt(jTextField2id.getText());
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int ide = rs.getInt("BookID");

                    if (id == ide) {
                        s++;
                        int quan = rs.getInt("Quantity");
                        PreparedStatement pq;
                        ResultSet rp;
                        String Query = "SELECT * FROM `issuebook`";
                        try {
                            pq = con.prepareStatement(Query);
                            rp = pq.executeQuery();
                            while (rp.next()) {
                                int bid = rp.getInt("BookID");
                                int stid=rp.getInt("Student ID");                              
                               
                                
                                        if (id == bid) {
                                    int isno = rp.getInt("IssueNum");
                                    if (quan <= isno) {
                                        JOptionPane.showMessageDialog(null, "This book is not available.");
                                        jTextField1bid.setText("");

                                        return;
                                    } else {
                                        jTextField1bn.setText(rs.getString("BookName"));
                                        return;
                                    }
                                } 
                                
                           
                            }

                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }

                        jTextField1bn.setText(rs.getString("BookName"));
                        break;
                    }
                }
                if (s == 0) {
                    JOptionPane.showMessageDialog(null, "Book id is not found");
                    jTextField1bid.setText("");
                     jTextField1bn.setText("");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
  
             
             
             
             
         }
    }//GEN-LAST:event_jTextField1bidKeyPressed

    private void jTextField3stunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3stunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3stunActionPerformed

    private void jTextField1bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1bnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1bnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbutton;
    private javax.swing.JButton jButton1issue;
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
    private javax.swing.JTextField jTextField1bid;
    private javax.swing.JTextField jTextField1bn;
    private javax.swing.JTextField jTextField2bn;
    private javax.swing.JTextField jTextField2id;
    private javax.swing.JTextField jTextField3stun;
    private javax.swing.JTextField jTextField4contac;
    // End of variables declaration//GEN-END:variables
}
