/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.DBConnection;

/**
 *
 * @author nihar
 */
public class RentalTransportationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RentalTransportationJPanel
     */
    
    JPanel rightJPanel;
    String username;
    int bookingId;
    Date bookingDate;
    public RentalTransportationJPanel() {
        initComponents();
    }
    public RentalTransportationJPanel(JPanel rightJPanel, String username, int bookingId, Date bookingDate) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.username = username;
        this.bookingId  = bookingId;
        this.bookingDate = bookingDate;
        
        try {
                    Connection connection = (Connection) DBConnection.con();
                    // Get transportation (id = 6) vendors where admin has approved registration
                    PreparedStatement st = connection.prepareStatement("Select vendor_id, vendor_name, concat(addr_line_1,\" \", addr_line_2) as address, email, phone_number from vendor_details where vendor_type_id=6 and registration_status=3");

                    ResultSet rs = st.executeQuery();
                    
                    
                    while(rs.next()){
                      String vendorId = rs.getString(1);  
                      String vendorName = rs.getString(2);
                      String address = rs.getString(3);
                      String email = rs.getString(4);
                      String phnNumber = rs.getString(5);
                      
                      String tblData[] = {vendorName, address, email, phnNumber};
                      DefaultTableModel tblModel = (DefaultTableModel)tblTransportationVendors.getModel();
                      tblModel.addRow(tblData);
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnTransportRequestToBook = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransportationVendors = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Vendor/Header.png"))); // NOI18N
        jLabel5.setText("jLabel2");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Vendor/Header.png"))); // NOI18N
        jLabel6.setText("jLabel2");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 255));
        jLabel10.setText("Rental Transportation Vendors");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(529, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(453, 453, 453))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnTransportRequestToBook.setText("Request to book");
        btnTransportRequestToBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 255)));
        btnTransportRequestToBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransportRequestToBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTransportRequestToBook, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnTransportRequestToBook, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tblTransportationVendors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vendor Id", "Name", "Full Address", "Email", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(tblTransportationVendors);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1192, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1327, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransportRequestToBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransportRequestToBookActionPerformed
        int rowSelected = tblTransportationVendors.getSelectedRow();
        if(rowSelected < 0){
            JOptionPane.showMessageDialog(this, "Select a record to request booking");
            return;
        }
        rowSelected = tblTransportationVendors.convertRowIndexToModel(rowSelected);
        DefaultTableModel model = (DefaultTableModel) tblTransportationVendors.getModel();
       
        Integer id = Integer.parseInt(model.getValueAt(rowSelected, 0).toString());
        
        System.out.println(id);
        
        try {
                    Connection connection = (Connection) DBConnection.con();
                    
                    PreparedStatement st1 = connection.prepareStatement("Select vendor_id from v_vendor_booking_details where vendor_id = ? and booking_date=? and status in (1, 3)");

                    st1.setInt(1, id);
                    st1.setDate(2, new java.sql.Date(bookingDate.getTime()));
                    
                    ResultSet rs = st1.executeQuery();
                    
                       if(rs.next()){
                          JOptionPane.showMessageDialog(this, "Vendor is unavailable for the selected date");                             
                       }
                       
                       else{
                    
                    String insertTableSQL = "INSERT INTO booking_event_details(booking_id, org_id, vendor_id, status) VALUES(?,?,?,?) ;";
                    PreparedStatement st = (PreparedStatement)connection.prepareStatement(insertTableSQL);
                    st.setInt(1, bookingId);
                    st.setInt(2, 6); // transport is 6
                    st.setInt(3, id);
                    st.setInt(4, 1);
                                                          
                    Integer returnedValue = st.executeUpdate();
                    if (returnedValue>0) {
                        
                        JOptionPane.showMessageDialog(this, "Transportation is requested");
                    
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter(model);
        tblTransportationVendors.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(null);
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "Something went wrong");
                    }
                    
                       }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
    }//GEN-LAST:event_btnTransportRequestToBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransportRequestToBook;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTransportationVendors;
    // End of variables declaration//GEN-END:variables
}
