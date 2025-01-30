
package librarymanage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class NewBook extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    
    public NewBook() {
        initComponents();
        this.setLocationRelativeTo(null);
        con=Connect.getConnection();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2_name = new javax.swing.JTextField();
        jComboBox1_edition = new javax.swing.JComboBox<>();
        jTextField4_price = new javax.swing.JTextField();
        jTextField5_page = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        Hbutton = new javax.swing.JButton();
        jTextField6_publisher = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1_quantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1writer = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setText("Add Book");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel6)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Book Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("Edition:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("Publisher:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("Price:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setText("Pages:");

        jTextField2_name.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N

        jComboBox1_edition.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1_edition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th" }));
        jComboBox1_edition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_editionActionPerformed(evt);
            }
        });

        jTextField4_price.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N

        jTextField5_page.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jTextField5_page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5_pageActionPerformed(evt);
            }
        });

        addbutton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        Hbutton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Hbutton.setText("Back");
        Hbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HbuttonActionPerformed(evt);
            }
        });

        jTextField6_publisher.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Quantity:");

        jTextField1_quantity.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 0));
        jLabel8.setText("Writer:");

        jTextField1writer.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Hbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1_quantity)
                            .addComponent(jComboBox1_edition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2_name)
                            .addComponent(jTextField6_publisher)
                            .addComponent(jTextField4_price)
                            .addComponent(jTextField5_page)
                            .addComponent(jTextField1writer))))
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1_edition, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField6_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1writer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(jTextField4_price))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5_page, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton)
                    .addComponent(Hbutton))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5_pageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5_pageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_pageActionPerformed

    private void jComboBox1_editionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_editionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_editionActionPerformed

    private void HbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HbuttonActionPerformed
        this.dispose();
           MainPage mp=new MainPage();
       mp.setVisible(true);
    }//GEN-LAST:event_HbuttonActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
     
    
      
      if(jComboBox1_edition.getSelectedItem().toString().isEmpty()||jTextField2_name.getText().isEmpty()||jTextField6_publisher.getText().isEmpty()||jTextField4_price.getText().isEmpty()||jTextField5_page.getText().isEmpty()||jTextField1_quantity.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(null,"Entry must not empty");
      }
      else
     
      { 
      String name=jTextField2_name.getText();
      String edition=jComboBox1_edition.getSelectedItem().toString();
      String publisher=jTextField6_publisher.getText();
      String price=jTextField4_price.getText();
      String writer=jTextField1writer.getText();
      String page=jTextField5_page.getText();
      int quantity=Integer.parseInt(jTextField1_quantity.getText());
    
        try {
            String query="INSERT INTO `newbook`(`BookName`, `Edition`, `Publisher`,`writer`, `Price`, `Pages`,`Quantity`) VALUES (?,?,?,?,?,?,?)";
            ps=con.prepareStatement(query);             
            ps.setString(1,name);
            ps.setString(2,edition);
            ps.setString(3,publisher);
            ps.setString(4, writer);
            ps.setString(5,price);
           ps.setString(6,page);
           ps.setInt(7,quantity);
           int k=ps.executeUpdate();
           if(k==1)
           {
              JOptionPane.showMessageDialog(null,"Book added successful");
           
              jTextField2_name.setText("");
              jComboBox1_edition.setSelectedIndex(-1);
              jTextField6_publisher.setText("");
              jTextField4_price.setText("");
              jTextField1writer.setText("");
              jTextField5_page.setText("");    
              jTextField1_quantity.setText("");
              
               
           }
           else
           {
              JOptionPane.showMessageDialog(null,"book added not successful"); 
           }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }   
          
      }
        
         
      
    }//GEN-LAST:event_addbuttonActionPerformed

 
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hbutton;
    private javax.swing.JButton addbutton;
    private javax.swing.JComboBox<String> jComboBox1_edition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1_quantity;
    private javax.swing.JTextField jTextField1writer;
    private javax.swing.JTextField jTextField2_name;
    private javax.swing.JTextField jTextField4_price;
    private javax.swing.JTextField jTextField5_page;
    private javax.swing.JTextField jTextField6_publisher;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
