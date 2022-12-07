/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Customer;

import java.awt.CardLayout;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Avinash Reddy
 */
public class CustomerBookEventJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CustomerBookEventJFrame
     */
    String username;

    public CustomerBookEventJFrame(String username) {
        this.username = username;
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

        jSplitPane = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        venueButton = new javax.swing.JButton();
        musicButton = new javax.swing.JButton();
        kidsEntertainmentButton = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        couplePackageButton = new javax.swing.JButton();
        cateringButton = new javax.swing.JButton();
        decorationButton = new javax.swing.JButton();
        giftShopButton = new javax.swing.JButton();
        rentalTransportationButton = new javax.swing.JButton();
        rightJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane.setDividerLocation(250);

        leftJPanel.setBackground(new java.awt.Color(204, 102, 255));
        leftJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(153, 0, 153));
        leftJPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 782, 250, 10));

        jSeparator3.setBackground(new java.awt.Color(153, 0, 153));
        leftJPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, -1));

        jSeparator4.setBackground(new java.awt.Color(153, 0, 153));
        leftJPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, -1));

        venueButton.setBackground(new java.awt.Color(204, 102, 255));
        venueButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        venueButton.setText("Venue");
        venueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venueButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(venueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 170, 50));

        musicButton.setBackground(new java.awt.Color(204, 102, 255));
        musicButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        musicButton.setText("Music");
        musicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(musicButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 170, 50));

        kidsEntertainmentButton.setBackground(new java.awt.Color(204, 102, 255));
        kidsEntertainmentButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kidsEntertainmentButton.setText("Kids Entertainment");
        kidsEntertainmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidsEntertainmentButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(kidsEntertainmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 170, 50));

        jSeparator5.setBackground(new java.awt.Color(153, 0, 153));
        leftJPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 250, -1));

        jSeparator7.setBackground(new java.awt.Color(153, 0, 153));
        leftJPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 250, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Services");
        leftJPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 70, -1));

        couplePackageButton.setBackground(new java.awt.Color(204, 102, 255));
        couplePackageButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        couplePackageButton.setText("Couple Package");
        couplePackageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couplePackageButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(couplePackageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 170, 50));

        cateringButton.setBackground(new java.awt.Color(204, 102, 255));
        cateringButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cateringButton.setText("Catering");
        cateringButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateringButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(cateringButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, 50));

        decorationButton.setBackground(new java.awt.Color(204, 102, 255));
        decorationButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        decorationButton.setText("Decoration");
        decorationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decorationButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(decorationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 170, 50));

        giftShopButton.setBackground(new java.awt.Color(204, 102, 255));
        giftShopButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        giftShopButton.setText("Gift Shop");
        giftShopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giftShopButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(giftShopButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 170, 50));

        rentalTransportationButton.setBackground(new java.awt.Color(204, 102, 255));
        rentalTransportationButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rentalTransportationButton.setText("Retal Transportation");
        rentalTransportationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentalTransportationButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(rentalTransportationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 170, 50));

        jSplitPane.setLeftComponent(leftJPanel);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
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
        jLabel12.setText("Select Any Offered Service ");
        rightJPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 310, -1));

        jSplitPane.setRightComponent(rightJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void venueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venueButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_venueButtonActionPerformed

    private void musicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musicButtonActionPerformed

    private void kidsEntertainmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidsEntertainmentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kidsEntertainmentButtonActionPerformed

    private void couplePackageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couplePackageButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_couplePackageButtonActionPerformed

    private void cateringButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cateringButtonActionPerformed
        CateringJPanel panel = new CateringJPanel(rightJPanel);
        rightJPanel.setLayout(null);
        
        rightJPanel.add(panel);
        
    }//GEN-LAST:event_cateringButtonActionPerformed

    private void decorationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decorationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decorationButtonActionPerformed

    private void giftShopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giftShopButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giftShopButtonActionPerformed

    private void rentalTransportationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentalTransportationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rentalTransportationButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerBookEventJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerBookEventJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerBookEventJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerBookEventJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerBookEventJFrame("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cateringButton;
    private javax.swing.JButton couplePackageButton;
    private javax.swing.JButton decorationButton;
    private javax.swing.JButton giftShopButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JButton kidsEntertainmentButton;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JButton musicButton;
    private javax.swing.JButton rentalTransportationButton;
    private javax.swing.JPanel rightJPanel;
    private javax.swing.JButton venueButton;
    // End of variables declaration//GEN-END:variables
}
