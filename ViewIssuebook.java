
package librarymanage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class ViewIssuebook extends javax.swing.JFrame {
    Connection con;

    public ViewIssuebook() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        con=Connect.getConnection();
        datashow();
        
    }
    public void datashow()
    { 
     
        
      PreparedStatement ps;
      ResultSet rs;
      String query="SELECT `Student ID`, `StudentName`, `Contact No`, `BookName`, `Issue Date`, `ReturnDate`,`IssueNum`,`BookID` FROM `issuebook`";
      try{
          ps=con.prepareStatement(query);
          rs=ps.executeQuery();
          ResultSetMetaData rsd=rs.getMetaData();
         int c=rsd.getColumnCount();         
         DefaultTableModel d=( DefaultTableModel)jTable1issue.getModel();
         d.setRowCount(0);
          while(rs.next())
          {
              Vector v=new Vector();
              for(int i=1;i<=c;i++)
              {
                  v.add(rs.getString("Student ID"));
                  v.add(rs.getString("StudentName"));
                  v.add(rs.getString("Contact No"));
                  v.add(rs.getString("BookName"));
                  v.add(rs.getString("Issue Date"));
                  v.add(rs.getString("ReturnDate"));
                  v.add(rs.getString("IssueNum"));
                  v.add(rs.getString("BookID"));
              }
              
              d.addRow(v);
          }
          
      }catch(Exception ex)
      {
          System.out.println(ex.getMessage());
      }
      
        
        
        
        
        
        
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1issue = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jTable1issue.setBackground(new java.awt.Color(153, 255, 102));
        jTable1issue.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable1issue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "StudentName", "Contact", "BookName", "IssueDate", "ReturnDate", "IssueNum", "BookID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1issue.setRowHeight(18);
        jTable1issue.setRowMargin(2);
        jTable1issue.setSelectionForeground(new java.awt.Color(204, 204, 0));
        jTable1issue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1issueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1issue);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
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

    private void jTable1issueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1issueMouseClicked
        DefaultTableModel d=(DefaultTableModel)jTable1issue.getModel();
        int row=jTable1issue.getSelectedRow();
        
        
    }//GEN-LAST:event_jTable1issueMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewIssuebook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1issue;
    // End of variables declaration//GEN-END:variables
}
