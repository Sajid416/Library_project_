
package librarymanage;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SearchingBook extends javax.swing.JFrame {
        Connection con;
   
    public SearchingBook() {
        initComponents();
        this.setLocationRelativeTo(null);
        con=Connect.getConnection();
        dataload();
    }
    public void dataload()
    {
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1bookname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1search = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Searching Book");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jLabel2.setText("Book Name:");

        jTextField1bookname.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jTextField1bookname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1booknameKeyPressed(evt);
            }
        });

        jTable1search.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookID", "BookName", "Edition", "Publisher", "writer", "Price", "Pages", "Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1searchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1search);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 153));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1bookname, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1bookname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(40, 40, 40)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1searchMouseClicked
        
    }//GEN-LAST:event_jTable1searchMouseClicked

    private void jTextField1booknameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1booknameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {   
            String bookname=(jTextField1bookname.getText()).toLowerCase();
            int ln=bookname.length();            
            
            
            if(jTextField1bookname.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter the book name");
            }
            else if(ln<3)
            {
               JOptionPane.showMessageDialog(null,"please enter 3 letters to search."); 
            }
            else{
                int k,s=0;
            PreparedStatement ps;
            ResultSet rs;
           
            String query=" SELECT * FROM `newbook`";
            try
            {
               ps=con.prepareStatement(query);
               rs=ps.executeQuery();
               ResultSetMetaData rsd=rs.getMetaData();
               k=rsd.getColumnCount();
               DefaultTableModel d=( DefaultTableModel)jTable1search.getModel();
               d.setRowCount(0);
               while(rs.next())
               {                 
                 String bn=(rs.getString("BookName")).toLowerCase(); 
                 int quanti=rs.getInt("Quantity");
                 int bid=rs.getInt("BookID");
                
                 if(bookname.charAt(0)==bn.charAt(0)&&bookname.charAt(1)==bn.charAt(1)&&bookname.charAt(2)==bn.charAt(2))
                 {
                    
                     s++;
                     
                     PreparedStatement pt;
                     ResultSet rt;
                     String Qury="SELECT * FROM `issuebook`";
                     
                     try{
                     pt=con.prepareStatement(Qury);
                     rt=pt.executeQuery();
                    int p=0;
                     while(rt.next())
                     {
                     int issunm=rt.getInt("IssueNum");
                     int id=rt.getInt("BookID");
                     if(bid==id)
                     {
                     int avail=quanti-issunm;
                     p++;
                      Vector v=new Vector();
                     for(int i=1;i<=k;i++)
                     {
                     v.add(rs.getString("BookID"));
                     v.add(rs.getString("BookName")); 
                     v.add(rs.getString("Edition"));
                     v.add(rs.getString("Publisher"));
                     v.add(rs.getString("writer"));                     
                     v.add(rs.getString("Price"));                     
                     v.add(rs.getString("Pages"));
                     v.add(avail);
                     
                     }
                      d.addRow(v); 
                     
                     }
                
                     }
                     if(p==0)
                     {
                        Vector v=new Vector();
                     for(int i=1;i<=k;i++)
                     {
                     v.add(rs.getString("BookID"));
                     v.add(rs.getString("BookName"));
                     v.add(rs.getString("Edition"));                     
                     v.add(rs.getString("Publisher"));
                     v.add(rs.getString("writer"));                     
                     v.add(rs.getString("Price"));
                     v.add(rs.getString("Pages"));
                     v.add(rs.getString("Quantity"));
                     
                   
               }
                d.addRow(v);  
                     }
                     
                     
                     
                     }catch(Exception ex)
                     {
                     
                     System.out.println(ex.getMessage());                     
                     
                     }                
                   
        
             
                 } 
             
               }
                     if(s==0)
               {
                  JOptionPane.showMessageDialog(null,"Empty search"); 
               }
               
            }catch(Exception ex)
            {
               System.out.println(ex.getMessage());
            }
     
            }
            }
             
    }//GEN-LAST:event_jTextField1booknameKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
       MainPage mp=new MainPage();
       mp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchingBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1search;
    private javax.swing.JTextField jTextField1bookname;
    // End of variables declaration//GEN-END:variables
}
