/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Admin;

<<<<<<< Updated upstream
=======
import java.awt.CardLayout;


>>>>>>> Stashed changes
/**
 *
 * @author Avinash Reddy
 */
public class AdminManageCustomerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminManageCustomerJFrame
     */
    public AdminManageCustomerJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
<<<<<<< Updated upstream
        vendorViewBookingsButton = new javax.swing.JButton();
        vendorViewDetailsButton = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        vendorManageRequestsButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rightJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
=======
        customerViewBookingsButton = new javax.swing.JButton();
        customersListButton = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        customerManageRequestsButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        rightJPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
>>>>>>> Stashed changes

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(250);

        leftJPanel.setBackground(new java.awt.Color(204, 102, 255));
<<<<<<< Updated upstream
        leftJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(153, 0, 153));
        leftJPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 782, 250, 10));

        jSeparator3.setBackground(new java.awt.Color(153, 0, 153));
        leftJPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, -1));

        jSeparator4.setBackground(new java.awt.Color(153, 0, 153));
        leftJPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, -1));

        vendorViewBookingsButton.setBackground(new java.awt.Color(204, 102, 255));
        vendorViewBookingsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vendorViewBookingsButton.setText("View Customer Bookings");
        vendorViewBookingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorViewBookingsButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(vendorViewBookingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 190, 50));

        vendorViewDetailsButton.setBackground(new java.awt.Color(204, 102, 255));
        vendorViewDetailsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vendorViewDetailsButton.setText("View All Customers");
        vendorViewDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorViewDetailsButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(vendorViewDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 190, 50));

        jSeparator5.setBackground(new java.awt.Color(153, 0, 153));
        leftJPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 250, -1));

        jSeparator7.setBackground(new java.awt.Color(153, 0, 153));
        leftJPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 250, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("<<Admin Name>>");
        leftJPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 180, -1));

        vendorManageRequestsButton.setBackground(new java.awt.Color(204, 102, 255));
        vendorManageRequestsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vendorManageRequestsButton.setText("Manage Customer Requests");
        vendorManageRequestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorManageRequestsButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(vendorManageRequestsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 190, 50));
=======

        jSeparator2.setBackground(new java.awt.Color(153, 0, 153));

        jSeparator3.setBackground(new java.awt.Color(153, 0, 153));

        jSeparator4.setBackground(new java.awt.Color(153, 0, 153));

        customerViewBookingsButton.setBackground(new java.awt.Color(204, 102, 255));
        customerViewBookingsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customerViewBookingsButton.setText("View Customer Bookings");
        customerViewBookingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerViewBookingsButtonActionPerformed(evt);
            }
        });

        customersListButton.setBackground(new java.awt.Color(204, 102, 255));
        customersListButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customersListButton.setText("View All Customers");
        customersListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersListButtonActionPerformed(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(153, 0, 153));

        jSeparator7.setBackground(new java.awt.Color(153, 0, 153));

        customerManageRequestsButton.setBackground(new java.awt.Color(204, 102, 255));
        customerManageRequestsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customerManageRequestsButton.setText("Manage Customer Requests");
        customerManageRequestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerManageRequestsButtonActionPerformed(evt);
            }
        });
>>>>>>> Stashed changes

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Profile Photo(optional)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );

<<<<<<< Updated upstream
        leftJPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 190));

        jSplitPane1.setLeftComponent(leftJPanel);

        rightJPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Header.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        rightJPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 320, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Header.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        rightJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 120));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Header.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        rightJPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 630, 120));

        jPanel3.setBackground(new java.awt.Color(204, 102, 255));

        jSeparator1.setBackground(new java.awt.Color(153, 0, 153));
=======
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("<<Admin Name>>");
>>>>>>> Stashed changes

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< Updated upstream
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
=======
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
>>>>>>> Stashed changes
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
<<<<<<< Updated upstream
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rightJPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1320, 40));

        jPanel5.setBackground(new java.awt.Color(204, 102, 255));

        jSeparator6.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rightJPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 1320, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 255));
        jLabel12.setText("Admin Work Area");
        rightJPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 210, -1));
=======
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(leftJPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(customerManageRequestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftJPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(customersListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftJPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(customerViewBookingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(customerManageRequestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(customersListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(customerViewBookingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setLeftComponent(leftJPanel);

        rightJPanel.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Customer/Logo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(418, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        rightJPanel.add(jPanel2, "card2");
>>>>>>> Stashed changes

        jSplitPane1.setRightComponent(rightJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< Updated upstream
    private void vendorViewBookingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorViewBookingsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendorViewBookingsButtonActionPerformed

    private void vendorViewDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorViewDetailsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendorViewDetailsButtonActionPerformed

    private void vendorManageRequestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorManageRequestsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendorManageRequestsButtonActionPerformed
=======
    private void customerViewBookingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerViewBookingsButtonActionPerformed
        // TODO add your handling code here:
        CustomerBookingsJPanel shjp = new CustomerBookingsJPanel(rightJPanel);
        rightJPanel.add("CustomerBookingsJPanel",shjp);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);

    }//GEN-LAST:event_customerViewBookingsButtonActionPerformed

    private void customersListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersListButtonActionPerformed
        // TODO add your handling code here:
        CustomersListJPanel shjp = new CustomersListJPanel(rightJPanel);
        rightJPanel.add("CustomersListJPanel",shjp);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_customersListButtonActionPerformed

    private void customerManageRequestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerManageRequestsButtonActionPerformed
        // TODO add your handling code here:
        CustomerRequestJPanel shjp = new CustomerRequestJPanel(rightJPanel);
        rightJPanel.add("CustomerRequestJPanel",shjp);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_customerManageRequestsButtonActionPerformed
>>>>>>> Stashed changes

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminManageCustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminManageCustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminManageCustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminManageCustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminManageCustomerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< Updated upstream
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
=======
    private javax.swing.JButton customerManageRequestsButton;
    private javax.swing.JButton customerViewBookingsButton;
    private javax.swing.JButton customersListButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
>>>>>>> Stashed changes
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
<<<<<<< Updated upstream
    private javax.swing.JSeparator jSeparator6;
=======
>>>>>>> Stashed changes
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JPanel rightJPanel;
<<<<<<< Updated upstream
    private javax.swing.JButton vendorManageRequestsButton;
    private javax.swing.JButton vendorViewBookingsButton;
    private javax.swing.JButton vendorViewDetailsButton;
=======
>>>>>>> Stashed changes
    // End of variables declaration//GEN-END:variables
}
