
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


public class ViewStudent extends javax.swing.JFrame {
 
        Connection con;
     
    
    public ViewStudent() {
        initComponents();
      
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    
        con=Connect.getConnection();
            dataload();
    }
           public void dataload()
    {
        int c;
          PreparedStatement ps;
        ResultSet rs;
        String query="SELECT * FROM `stuent register`";
       try {
           ps=con.prepareStatement(query);
           rs=ps.executeQuery();
           ResultSetMetaData rsd=rs.getMetaData();
           c=rsd.getColumnCount();
           DefaultTableModel d=(DefaultTableModel)jTable1data.getModel();
           d.setRowCount(0);
           while(rs.next())
           {
                 Vector v=new Vector();
               for(int i=1;i<=c;i++)
               {
                   
                 
                   v.add(rs.getString("Student ID"));
                   v.add(rs.getString("Name"));
                   v.add(rs.getString("Fathername"));                   
                   v.add(rs.getString("year"));
                   v.add(rs.getString("semester"));
              
                   
               }
               d.addRow(v);
           }
           
       } catch (Exception ex) {
           System.out.println(ex.getMessage());
       }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1data = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3_fname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3_year = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2_semester = new javax.swing.JComboBox<>();
        jButton1update = new javax.swing.JButton();
        jButton2delete = new javax.swing.JButton();
        jButton3home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 204));

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));

        jTable1data.setBackground(new java.awt.Color(255, 204, 204));
        jTable1data.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTable1data.setForeground(new java.awt.Color(51, 51, 51));
        jTable1data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Father Name", "Series", "Semester"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1data);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Student ID:");

        jTextField1id.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name:");

        jTextField2_name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Father Name:");

        jTextField3_fname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Series:");

        jComboBox3_year.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox3_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018", "2019" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Semester:");

        jComboBox2_semester.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox2_semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));

        jButton1update.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton1update.setText("Update");
        jButton1update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1updateActionPerformed(evt);
            }
        });

        jButton2delete.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton2delete.setText("Delete");
        jButton2delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2deleteActionPerformed(evt);
            }
        });

        jButton3home.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton3home.setText("Home");
        jButton3home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1id, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(jTextField2_name)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3_year, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2_semester, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton1update)
                        .addGap(44, 44, 44)
                        .addComponent(jButton2delete)
                        .addGap(47, 47, 47)
                        .addComponent(jButton3home)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox3_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox2_semester, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1update)
                    .addComponent(jButton2delete)
                    .addComponent(jButton3home))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton3homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3homeActionPerformed
            this.dispose();
           MainPage mp=new MainPage();
       mp.setVisible(true);
    }//GEN-LAST:event_jButton3homeActionPerformed

    private void jTable1dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1dataMouseClicked
        DefaultTableModel d=(DefaultTableModel)jTable1data.getModel();
        int row=jTable1data.getSelectedRow();
        String id=d.getValueAt(row,0).toString();
        String name=d.getValueAt(row,1).toString();
        String fname=d.getValueAt(row,2).toString();        
        String year=d.getValueAt(row,3).toString();
        String semester=d.getValueAt(row,4).toString();
        jTextField1id.setText(id);
        jTextField2_name.setText(name);
        jTextField3_fname.setText(fname);      
        jComboBox3_year.setSelectedItem(year);
        jComboBox2_semester.setSelectedItem(semester);
        
        
    }//GEN-LAST:event_jTable1dataMouseClicked

    private void jButton1updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1updateActionPerformed
       DefaultTableModel d=(DefaultTableModel)jTable1data.getModel();
       
       int row=jTable1data.getSelectedRow();
       if(row==-1)
       {
          JOptionPane.showMessageDialog(null,"No row selected or exist"); 
       }
       else
       {
           String id=d.getValueAt(row,0).toString();
       String name= jTextField2_name.getText();
       String fname=  jTextField3_fname.getText();    
       String year= jComboBox3_year.getSelectedItem().toString();
       String semester=  jComboBox2_semester.getSelectedItem().toString();
       Statement st;
       String query="UPDATE `stuent register` SET `Name`='"+name+"',`Fathername`='"+fname+"',`year`='"+year+"',`semester`='"+semester+"' WHERE `Student ID`='"+id+"'";
       try{
           st=con.createStatement();
           int k=st.executeUpdate(query);
           if(k==1)
           {
               JOptionPane.showMessageDialog(null,"update successful");
               dataload();
                 jTextField1id.setText("");
                  jTextField2_name.setText("");
                  jTextField3_fname.setText("");                 
                  jComboBox3_year.setSelectedIndex(-1);
                  jComboBox2_semester.setSelectedIndex(-1);
               
               
           }
           else
           {
               JOptionPane.showMessageDialog(null,"update not successful"); 
           }
           
           
       }catch(Exception ex)
       {
           System.out.println(ex.getMessage());
       }  
       }
     
       
    }//GEN-LAST:event_jButton1updateActionPerformed

    private void jButton2deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2deleteActionPerformed
         DefaultTableModel d=(DefaultTableModel)jTable1data.getModel();       
       int row=jTable1data.getSelectedRow();
       if(row==-1)
       {
          JOptionPane.showMessageDialog(null,"No row selected or exist"); 
       }
       else
       {
           String id=d.getValueAt(row,0).toString();
           Statement st;
           String query="DELETE FROM `stuent register` WHERE `Student ID`='"+id+"'";
           try{
               st=con.createStatement();
               int k=st.executeUpdate(query);
               if(k==1)
               {
                 JOptionPane.showMessageDialog(null,"delete successful"); 
                 dataload();
                 jTextField1id.setText("");
                  jTextField2_name.setText("");
                  jTextField3_fname.setText("");                
                  jComboBox3_year.setSelectedIndex(-1);
                  jComboBox2_semester.setSelectedIndex(-1);
               
                 
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"delete not successful"); 
               }
               
           }catch(Exception ex)
           {
               System.out.println(ex.getMessage());
           }
       }
       
    }//GEN-LAST:event_jButton2deleteActionPerformed

    public static void main(String args[]) {
     
      ViewStudent vw=new ViewStudent();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1update;
    private javax.swing.JButton jButton2delete;
    private javax.swing.JButton jButton3home;
    private javax.swing.JComboBox<String> jComboBox2_semester;
    private javax.swing.JComboBox<String> jComboBox3_year;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1data;
    private javax.swing.JTextField jTextField1id;
    private javax.swing.JTextField jTextField2_name;
    private javax.swing.JTextField jTextField3_fname;
    // End of variables declaration//GEN-END:variables
}
