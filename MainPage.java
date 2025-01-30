
package librarymanage;

import javax.swing.JFrame;


public class MainPage extends javax.swing.JFrame {

   
    public MainPage() {
        initComponents();
       
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        newbbutton = new javax.swing.JButton();
        ViewBButton = new javax.swing.JButton();
        nbbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        issuebutton = new javax.swing.JButton();
        jButton3issuebook = new javax.swing.JButton();
        jButton7available = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2renew = new javax.swing.JButton();
        jButton5returnb = new javax.swing.JButton();
        jButton1searchbook = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton6logout = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(java.awt.Color.orange);

        newbbutton.setBackground(new java.awt.Color(255, 255, 255));
        newbbutton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        newbbutton.setForeground(new java.awt.Color(102, 204, 0));
        newbbutton.setText("Add Books");
        newbbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newbbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbbuttonActionPerformed(evt);
            }
        });

        ViewBButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        ViewBButton.setForeground(new java.awt.Color(204, 0, 204));
        ViewBButton.setText("View Books");
        ViewBButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBButtonActionPerformed(evt);
            }
        });

        nbbutton.setBackground(new java.awt.Color(255, 255, 255));
        nbbutton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        nbbutton.setForeground(new java.awt.Color(51, 0, 204));
        nbbutton.setText("New Students");
        nbbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nbbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newbbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(ViewBButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nbbutton)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewBButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newbbutton)
                    .addComponent(nbbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Change Password");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 3, 200)));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 0, 153));

        issuebutton.setBackground(new java.awt.Color(255, 255, 255));
        issuebutton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        issuebutton.setForeground(new java.awt.Color(0, 204, 0));
        issuebutton.setText("Issue Book");
        issuebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        issuebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebuttonActionPerformed(evt);
            }
        });

        jButton3issuebook.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton3issuebook.setForeground(new java.awt.Color(0, 153, 153));
        jButton3issuebook.setText("View Issued Books");
        jButton3issuebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3issuebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3issuebookActionPerformed(evt);
            }
        });

        jButton7available.setBackground(new java.awt.Color(255, 255, 255));
        jButton7available.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton7available.setForeground(new java.awt.Color(153, 0, 153));
        jButton7available.setText("Available Book");
        jButton7available.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7availableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7available, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(issuebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton3issuebook)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issuebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3issuebook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7available, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jButton2renew.setBackground(new java.awt.Color(255, 255, 255));
        jButton2renew.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton2renew.setForeground(new java.awt.Color(0, 153, 153));
        jButton2renew.setText("Renew Book");
        jButton2renew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2renew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2renewActionPerformed(evt);
            }
        });

        jButton5returnb.setBackground(new java.awt.Color(255, 255, 255));
        jButton5returnb.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton5returnb.setForeground(new java.awt.Color(0, 153, 153));
        jButton5returnb.setText("Return Book");
        jButton5returnb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5returnb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5returnbActionPerformed(evt);
            }
        });

        jButton1searchbook.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton1searchbook.setForeground(new java.awt.Color(255, 0, 0));
        jButton1searchbook.setText("SearchBook");
        jButton1searchbook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1searchbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1searchbookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5returnb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton2renew)
                .addGap(71, 71, 71)
                .addComponent(jButton1searchbook)
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2renew)
                            .addComponent(jButton5returnb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1searchbook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 51, 0));
        jLabel6.setText("Library Management");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setText("System");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Home Page");

        jButton6logout.setBackground(new java.awt.Color(255, 255, 255));
        jButton6logout.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton6logout.setForeground(new java.awt.Color(0, 51, 153));
        jButton6logout.setText("Logout");
        jButton6logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton6logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6logout)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6logoutActionPerformed
        this.dispose();
        LoginForm lf=new LoginForm();
        lf.setVisible(true);
    }//GEN-LAST:event_jButton6logoutActionPerformed

    private void jButton1searchbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1searchbookActionPerformed

        //this.dispose();
        SearchingBook sb=new SearchingBook();
        sb.setVisible(true);
    }//GEN-LAST:event_jButton1searchbookActionPerformed

    private void jButton5returnbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5returnbActionPerformed
        this.dispose();
        ReturnBook rb=new ReturnBook();
        rb.setVisible(true);
    }//GEN-LAST:event_jButton5returnbActionPerformed

    private void jButton2renewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2renewActionPerformed
        this.dispose();
        RenewBook rb=new RenewBook();
        rb.setVisible(true);
    }//GEN-LAST:event_jButton2renewActionPerformed

    private void jButton7availableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7availableActionPerformed
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Availablebook1 av=new Availablebook1();
        av.datashow();
        av.setVisible(true);
    }//GEN-LAST:event_jButton7availableActionPerformed

    private void jButton3issuebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3issuebookActionPerformed

        ViewIssuebook is=new ViewIssuebook();
        is.datashow();
        is.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton3issuebookActionPerformed

    private void issuebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebuttonActionPerformed
        this.dispose();
        IssueBook11 ib=new  IssueBook11();
        ib.setVisible(true);

    }//GEN-LAST:event_issuebuttonActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
        ChangePass Cp=new  ChangePass ();
        Cp.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void nbbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbbuttonActionPerformed
        this.dispose();
        NewStudent ns=new NewStudent();
        ns.setVisible(true);
    }//GEN-LAST:event_nbbuttonActionPerformed

    private void ViewBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBButtonActionPerformed

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        ViewBook vb=new ViewBook();
        vb.dataload();
        vb.setVisible(true);
    }//GEN-LAST:event_ViewBButtonActionPerformed

    private void newbbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbbuttonActionPerformed

        this.dispose();
        NewBook nb=new NewBook();
        nb.setVisible(true);
    }//GEN-LAST:event_newbbuttonActionPerformed

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewBButton;
    private javax.swing.JButton issuebutton;
    private javax.swing.JButton jButton1searchbook;
    private javax.swing.JButton jButton2renew;
    private javax.swing.JButton jButton3issuebook;
    private javax.swing.JButton jButton5returnb;
    private javax.swing.JButton jButton6logout;
    private javax.swing.JButton jButton7available;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nbbutton;
    private javax.swing.JButton newbbutton;
    // End of variables declaration//GEN-END:variables
}
