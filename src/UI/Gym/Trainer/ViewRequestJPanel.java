/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Gym.Trainer;

import Business.Booking.Room;
import Business.Program.Program;
import Business.Enterprise.GymEnterprise;
import Business.Accounts.UserAccount;
import Business.WorkQueue.BookingRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.ProgramQueue;
import Business.WorkQueue.ProgramRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author shreya
 */
public class ViewRequestJPanel extends javax.swing.JPanel {

    private JPanel container;
    private UserAccount account;
    private GymEnterprise gymEnterprise;
    /**
     * Creates new form ReverseRequestJPanel
     */
    public ViewRequestJPanel(JPanel container, UserAccount account, GymEnterprise gymEnterprise) {
        initComponents();
        this.container = container;
        this.account = account;
        this.gymEnterprise = gymEnterprise;
        populateRequest();
        populateComboBox();
    }
    public void populateRequest() {
       DefaultTableModel model = (DefaultTableModel) tblRequestList.getModel();
        
        model.setRowCount(0);
        for(BookingRequest bookingRequest : gymEnterprise.getBookingQueue().getAppointmentRequestList()){
            if(bookingRequest.getReceiver() == null || bookingRequest.getReceiver() == account){
               Object[] row = new Object[4];
               
                row[0] = bookingRequest;
                row[1] = bookingRequest.getSender();
                row[2] = bookingRequest.getAppointment().getClassRoom();
                row[3] = bookingRequest.getStatus();
                
                model.addRow(row); 
            }
        }
    }
     public void populateComboBox(){
        cboClassRoom.removeAll();
        for(Room classRoom : gymEnterprise.getRoomDirec().getClassRoomList()){
            cboClassRoom.addItem(classRoom);
        }
    }
    public boolean checkRoom(BookingRequest request, Room classRoom){
        boolean avilable = false;
        
        for(BookingRequest bookingRequest : gymEnterprise.getBookingQueue().getAppointmentRequestList())
            if(bookingRequest.getStatus().equals("Accept") && bookingRequest.getAppointment().getClassRoom() == classRoom && request.getAppointment().getDate().equals(bookingRequest.getAppointment().getDate()) && request.getAppointment().getSession().equals(bookingRequest.getAppointment().getSession()))
                avilable = true;
        return avilable;
    }
    
    public boolean checkSchedule(BookingRequest request){
        boolean avilable = false;
        
        for(BookingRequest bookingRequest : account.getAppointmentQueue().getAppointmentRequestList())
            if(bookingRequest.getStatus().equals("Accept") && request.getAppointment().getDate().equals(bookingRequest.getAppointment().getDate()) && request.getAppointment().getSession().equals(bookingRequest.getAppointment().getSession()))
                avilable = true;
        return avilable;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        acceptBtn = new javax.swing.JButton();
        declineBtn = new javax.swing.JButton();
        cboClassRoom = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblRequestList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date and Time", "Customer", "Block Number", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequestList.setRowHeight(40);
        tblRequestList.setRowMargin(4);
        tblRequestList.setSelectionBackground(new java.awt.Color(215, 145, 54));
        jScrollPane1.setViewportView(tblRequestList);

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel1.setText("Requests from customers..");

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/goback.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        acceptBtn.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        acceptBtn.setForeground(new java.awt.Color(0, 153, 153));
        acceptBtn.setText("Accept");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        declineBtn.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        declineBtn.setForeground(new java.awt.Color(255, 153, 153));
        declineBtn.setText("Reject");
        declineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel2.setText("Select the block no. to fix the meeting in .. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(162, 162, 162)
                                        .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)
                                        .addComponent(declineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboClassRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(411, 411, 411))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(634, 634, 634))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboClassRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(declineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblRequestList.getSelectedRow();
        
        
        if(selectedRow >= 0){
            BookingRequest bookingRequest = (BookingRequest)tblRequestList.getValueAt(selectedRow, 0);
            if(!bookingRequest.getStatus().equals("Pending")){
                JOptionPane.showMessageDialog(null, "You cannot change it.");
            }
            else{
                Room classRoom = (Room) cboClassRoom.getSelectedItem();
                if(!checkRoom(bookingRequest, classRoom)){
                    if(!checkSchedule(bookingRequest)){
                        bookingRequest.setStatus("Accept");
                         JOptionPane.showMessageDialog(null, "Accept Successful");
                        bookingRequest.getAppointment().setClassRoom(classRoom);
                        bookingRequest.setReceiver(account);
                        populateRequest();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "You have schedule at that time");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "This room has been taken");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void declineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequestList.getSelectedRow();
        if(selectedRow >= 0){
            BookingRequest appointmentRequest = (BookingRequest)tblRequestList.getValueAt(selectedRow, 0);
            if(!appointmentRequest.getStatus().equals("Pending")){
                JOptionPane.showMessageDialog(null, "You cannot change it.");
            }
            else{
                appointmentRequest.setStatus("Decline");
                JOptionPane.showMessageDialog(null, "Decline Successfully");
                appointmentRequest.setReceiver(account);
                populateRequest();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_declineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox cboClassRoom;
    private javax.swing.JButton declineBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequestList;
    // End of variables declaration//GEN-END:variables

    
}
