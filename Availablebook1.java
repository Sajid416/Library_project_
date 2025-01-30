
package librarymanage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Availablebook1 extends javax.swing.JFrame {

   Connection con;
    public Availablebook1() {
        initComponents();
          this.setLocationRelativeTo(null);
        con = Connect.getConnection();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        datashow();
    }
    
    public void datashow() {  //
        PreparedStatement ps;
        ResultSet rs;
        int s;
        String query ="SELECT * FROM `newbook`";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();  
             ResultSetMetaData rsd = rs.getMetaData();
                            int c = rsd.getColumnCount();
                            DefaultTableModel d = (DefaultTableModel) jTable1.getModel();
                            d.setRowCount(0);

            while (rs.next()) {
                int bid = rs.getInt("BookID");  
                 int quantity = rs.getInt("Quantity"); 
                //int issuenum = rs.getInt("IssueNum");
                
               s=0;
                try {
                     PreparedStatement pt;
                ResultSet rt;               
                String Query ="SELECT * FROM `issuebook`";

                    pt = con.prepareStatement(Query);
                    rt = pt.executeQuery();
                    
                    while (rt.next()) {
                       
                         int id = rt.getInt("BookID");                         
                       int issuenum = rt.getInt("IssueNum");
                       
                        if (id == bid) {
                            s++;
                            break;
                        }
                        
                    }
                    
                    if(s==0)
                    {
                       
                      Vector v = new Vector();
                                for (int i = 1; i <= c; i++) {
                                    v.add(rs.getString("BookID"));                                     
                                    v.add(rs.getString("BookName"));                                    
                                    v.add(rs.getString("Edition"));                                    
                                    v.add(rs.getString("Publisher"));
                                    v.add(rs.getString("writer"));
                                    v.add(rs.getString("Price"));                                  
                                    v.add(rs.getString("Pages"));                                    
                                    v.add(quantity);
                                     

                                }
                                d.addRow(v);   
                        
                    }
                    else
                    {
                         int id = rt.getInt("BookID");                         
                       int issuenum = rt.getInt("IssueNum");
                        
                        if (quantity > issuenum) {
                            
                       
                                Vector v = new Vector();
                                for (int i = 1; i <= c; i++) {
                                    v.add(rs.getString("BookID"));                                   
                                    v.add(rs.getString("BookName"));                                   
                                    v.add(rs.getString("Edition"));                                   
                                    v.add(rs.getString("Publisher"));
                                     v.add(rs.getString("writer"));                                    
                                    v.add(rs.getString("Price"));                                    
                                    v.add(rs.getString("Pages"));                                    
                                    v.add(quantity - issuenum);
                                    

                                }
                                d.addRow(v);

                            }  
                
                    }

                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookID", "BookName", "Edition", "Publisher", "writer", "Price", "Pages", "Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Availablebook1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
