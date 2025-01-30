
package librarymanage;

import com.sun.glass.events.KeyEvent;
import static java.lang.String.format;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ReturnBook extends javax.swing.JFrame {
   Connection con;
    
    public ReturnBook() {
        initComponents();
        this.setLocationRelativeTo(null);
        con=Connect.getConnection();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1stid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4stname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6Bname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2fpd = new javax.swing.JTextField();
        jTextField3tfine = new javax.swing.JTextField();
        jButton1delete = new javax.swing.JButton();
        jTextField1rdate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1dayselap = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Return Book");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel2.setText("Student ID:");

        jTextField1stid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField1stid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1stidKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel3.setText("Student Name:");

        jLabel4stname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4stname.setText("JLabel4");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel5.setText("Book Name:");

        jLabel6Bname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6Bname.setText("JLabel6");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel7.setText("Return Date:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel8.setText("Fine per Day:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel9.setText("Total Fine:");

        jTextField2fpd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTextField3tfine.setEditable(false);
        jTextField3tfine.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jButton1delete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1delete.setText("Delete");
        jButton1delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1deleteActionPerformed(evt);
            }
        });

        jTextField1rdate.setEditable(false);
        jTextField1rdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel4.setText("Days  Elapse:");

        jTextField1dayselap.setEditable(false);
        jTextField1dayselap.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton1delete)
                    .addGap(26, 26, 26)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(78, 78, 78))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel7))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)))))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1dayselap, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3tfine, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2fpd, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1rdate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(70, 70, 70)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4stname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1stid, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6Bname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 112, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1stid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4stname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6Bname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1rdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1dayselap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField2fpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField3tfine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1delete)
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
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
                JOptionPane.showMessageDialog(null,"please enter your id");
            }
            else if(jTextField2fpd.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(null,"please enter fine per day field"); 
            }
            else
            {
                 int stid=Integer.parseInt(jTextField1stid.getText());
       PreparedStatement ps;
       ResultSet rs;
       int s=0;
       String quary="SELECT * FROM `issuebook`";
       try{
           ps=con.prepareStatement(quary);
           rs=ps.executeQuery();
           while(rs.next())
           {
               int sid=rs.getInt("Student ID");
                
               if(stid==sid)
               {
                   s++;
                   break;
               }
           }
           if(s==0)
           {
               JOptionPane.showMessageDialog(null,"this id is not issued");
               jTextField1stid.setText("");
               jTextField2fpd.setText("");
           }
           else
           {
               String stname=rs.getString("StudentName");
                String bookname=rs.getString("BookName");
                SimpleDateFormat myformat1=new SimpleDateFormat("YYYY-MM-dd");
                String rdate=rs.getString("ReturnDate");
                 SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                ZoneId z=ZoneId.of("Asia/Colombo");
                LocalDate today=LocalDate.now(z);
                String currentdate=today.toString();                 
                String Firstdate=currentdate;
                String Seconddate=rdate;
                 
                   Date d1=null;
                    Date d2=null;
                try
                {
                    d1=myformat.parse(Firstdate);
                   d2=myformat.parse(Seconddate);
                    
                    
                }catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                } 
                 
                    long dif=d1.getTime()-d2.getTime();                    
                    long hours=dif/(60*60*1000);
                    long days=hours/24;            
                   
              
                   jLabel4stname.setText(stname);
                   jLabel6Bname.setText(bookname);
                    jTextField1rdate.setText(rdate);
                   
                        long fine;
                      long pfine=Long.parseLong(jTextField2fpd.getText());
                    if(days>0)
                    {    
                         
                         fine=days*pfine;                       
                        
                         jTextField1dayselap.setText(String.valueOf(days));                                                    
                          jTextField3tfine.setText(String.valueOf(fine)); 
                        
                    }
                    else
                    {
                          jTextField1dayselap.setText("0");
                          jTextField2fpd.setEditable(false);
                          jTextField3tfine.setText("0");
                        
                    }
                    
               /* LocalDateTime date = java.time.LocalDateTime.now();
                SimpleDateFormat dateformat=new SimpleDateFormat("YYYY-MM-dd");
                String issuedate=dateformat.format(date);
                
                System.out.println(issuedate);
               // DATEDIFF(date,rdate);
               */
               
               
               
           }
           
           
       }catch(Exception ex)
       {
           System.out.println(ex.getMessage());
       } 
            }
      
        }
    }//GEN-LAST:event_jTextField1stidKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.dispose();
      MainPage mp=new MainPage();
      mp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1deleteActionPerformed
         int id=Integer.parseInt(jTextField1stid.getText());
         PreparedStatement ps;
         ResultSet rs;
         String query="DELETE FROM `issuebook` WHERE `Student ID`='"+id+"'";
         try{
             
             ps=con.prepareStatement(query);
             int k=ps.executeUpdate();
             if(k==1)
             {
                 JOptionPane.showMessageDialog(null,"Return book successfully");
                 jTextField1stid.setText("");
                 jLabel4stname.setText("");
                 jLabel6Bname.setText("");
                 jTextField1rdate.setText("");
                 jTextField1dayselap.setText("");
                 jTextField2fpd.setText("");
                 jTextField3tfine.setText("");
             }
             else
             {
                JOptionPane.showMessageDialog(null,"Return book is not successful");  
             }
             
             
         }catch(Exception ex)
         {
             System.out.println(ex.getMessage());
         }
    }//GEN-LAST:event_jButton1deleteActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1delete;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4stname;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6Bname;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1dayselap;
    private javax.swing.JTextField jTextField1rdate;
    private javax.swing.JTextField jTextField1stid;
    private javax.swing.JTextField jTextField2fpd;
    private javax.swing.JTextField jTextField3tfine;
    // End of variables declaration//GEN-END:variables

   
}
