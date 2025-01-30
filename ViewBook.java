
package librarymanage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewBook extends javax.swing.JFrame {

    Connection con;
    
    public ViewBook() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        con=Connect.getConnection();
        dataload();
    }
    public void dataload()
    {
        int k;
        PreparedStatement ps;
        ResultSet rs;
        String query="SELECT * FROM `newbook` ";
        try {
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            ResultSetMetaData rsd=rs.getMetaData();
            k=rsd.getColumnCount();
            DefaultTableModel d=( DefaultTableModel)jTable1bt.getModel();
            d.setRowCount(0);
            while(rs.next())
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
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ViewBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void clickdata()
    {
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1bt = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3pub = new javax.swing.JTextField();
        jTextField4price = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1name = new javax.swing.JTextField();
        jComboBox1edition = new javax.swing.JComboBox<>();
        jTextField5page = new javax.swing.JTextField();
        jButton2edit = new javax.swing.JButton();
        jButton2delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1quantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1writer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jTable1bt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Name", "Edition", "Publisher", "writer", "price", "pages", "Quantity"
            }
        ));
        jTable1bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1btMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1bt);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Publisher:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Price:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Pages:");

        jTextField3pub.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextField4price.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Edition:");

        jTextField1name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1nameActionPerformed(evt);
            }
        });

        jComboBox1edition.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1edition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th" }));

        jTextField5page.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jButton2edit.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton2edit.setText("Update");
        jButton2edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2editActionPerformed(evt);
            }
        });

        jButton2delete.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton2delete.setText("Delete");
        jButton2delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2deleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Quantity:");

        jTextField1quantity.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Writer:");

        jTextField1writer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1name, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4price, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5page, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1edition, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton2edit)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2delete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jTextField3pub, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1writer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField4price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5page, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1edition))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3pub, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1writer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2edit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        MainPage mp=new MainPage();
        mp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1btMouseClicked
        DefaultTableModel d=( DefaultTableModel)jTable1bt.getModel();
        int row=jTable1bt.getSelectedRow();
       int bookid=Integer.parseInt(d.getValueAt(row,0).toString());
        String name=d.getValueAt(row,1).toString();
        String edition=d.getValueAt(row,2).toString();
        String publisher=d.getValueAt(row,3).toString();
        String writer=d.getValueAt(row,4).toString();
        String price=d.getValueAt(row,5).toString();        
        String page=d.getValueAt(row,6).toString();
         String quantity=d.getValueAt(row,7).toString();
       
        jTextField1name.setText(name);
       jComboBox1edition.setSelectedItem(edition);
        jTextField3pub.setText(publisher);
        jTextField1writer.setText(writer);
        jTextField4price.setText(price);
        jTextField5page.setText(page);
        jTextField1quantity.setText(quantity);
    }//GEN-LAST:event_jTable1btMouseClicked

    private void jButton2editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2editActionPerformed
         
       
       
       
            DefaultTableModel d=( DefaultTableModel)jTable1bt.getModel();
          int row=jTable1bt.getSelectedRow();
          if(row==-1)
          {
              JOptionPane.showMessageDialog(null,"No row selected or exist");
          }
          else
          {
               int bookid=Integer.parseInt(d.getValueAt(row,0).toString());
        
        String name=jTextField1name.getText();
         
        String edition= jComboBox1edition.getSelectedItem().toString();
      
        String publisher= jTextField3pub.getText();
        String writ=jTextField1writer.getText();
        String price=  jTextField4price.getText();
     
        String page= jTextField5page.getText();
        int quantity=Integer.parseInt(jTextField1quantity.getText());
            Statement ps;               
          String query="UPDATE `newbook` SET `BookName`='"+name+"',`Edition`='"+edition+"',`Publisher`='"+publisher+"',`writer`='"+writ+"',`Price`='"+price+"',`Pages`='"+page+"',`Quantity`='"+quantity+"' WHERE `BookID`='"+bookid+"'";
             try{
                ps=con.createStatement();
                int k=ps.executeUpdate(query);
                if(k==1)
                {
                   JOptionPane.showMessageDialog(null,"update success");
                   dataload();
                     jTextField1name.setText("");
                     jComboBox1edition.setSelectedItem("");
                     jTextField3pub.setText("");
                     jTextField1writer.setText("");
                     jTextField4price.setText("");
                     jTextField5page.setText("");
                     jTextField1quantity.setText("");
                }
                else
                {
                     JOptionPane.showMessageDialog(null,"update not success");
                }
          }catch(Exception ex)
          {
              System.out.println(ex.getMessage());
          } 
          }         
           
           
            
            
           
    }//GEN-LAST:event_jButton2editActionPerformed

    private void jButton2deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2deleteActionPerformed
       DefaultTableModel d=( DefaultTableModel)jTable1bt.getModel();
          int row=jTable1bt.getSelectedRow();
             if(row==-1)
          {
              JOptionPane.showMessageDialog(null,"No row selected or exist");
          }
          else
          {
               int bookid=Integer.parseInt(d.getValueAt(row,0).toString());
          
       
        
            Statement ps;         
           
          String query="DELETE FROM `newbook` WHERE `BookID`='"+bookid+"'";
          try{
                ps=con.createStatement();
                int k=ps.executeUpdate(query);
                if(k==1)
                {
                   JOptionPane.showMessageDialog(null,"Deleted successful");
                   dataload();
                     jTextField1name.setText("");
                     jComboBox1edition.setSelectedItem("");
                     jTextField3pub.setText("");
                     jTextField1writer.setText("");
                     jTextField4price.setText("");
                     jTextField5page.setText("");
                     jTextField1quantity.setText("");
                }
                else
                {
                     JOptionPane.showMessageDialog(null,"Deleted not successful");
                }
          }catch(Exception ex)
          {
              System.out.println(ex.getMessage());
          }
          }
           
    }//GEN-LAST:event_jButton2deleteActionPerformed

    private void jTextField1nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1nameActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2delete;
    private javax.swing.JButton jButton2edit;
    private javax.swing.JComboBox<String> jComboBox1edition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1bt;
    private javax.swing.JTextField jTextField1name;
    private javax.swing.JTextField jTextField1quantity;
    private javax.swing.JTextField jTextField1writer;
    private javax.swing.JTextField jTextField3pub;
    private javax.swing.JTextField jTextField4price;
    private javax.swing.JTextField jTextField5page;
    // End of variables declaration//GEN-END:variables
}
