/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Gym.Clerk;

import Business.EcoSystem;
import Business.Enterprise.GymEnterprise;
import Business.Network.Network;
import Business.Organization.ClerkOrganization;
import Business.Organization.TrainerOrganization;
import Business.Accounts.UserAccount;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sanket
 */
public class ClerkWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount account;
    private ClerkOrganization clerkOrganization;
    private GymEnterprise gymEnterprise;
    private Network network;
    private EcoSystem ecoSystem;
    private DateFormat df2;
    /**
     * Creates new form ClerkWorkAreaJPanel
     */
    public ClerkWorkAreaJPanel(JPanel container, UserAccount account, ClerkOrganization clerkOrganization, 
            GymEnterprise gymEnterprise, Network network, EcoSystem ecoSystem)
    {
        initComponents();
        this.container = container;
        this.account= account;
        this.clerkOrganization = clerkOrganization;
        this.gymEnterprise = (GymEnterprise)gymEnterprise;
        this.ecoSystem = ecoSystem;
        this.network = network;
        df2 = new SimpleDateFormat("YYYY/MM/DD");
        
        populateComboBox();
    }
    
    public void populateComboBox() {
        
        cbxClnDateSel.removeAll();
        
        for(Date date : gymEnterprise.getAppointmentTime().getDateList()){
            cbxClnDateSel.addItem(df2.format(date));
        }
        
        cbxTimeSlot.removeAll();
        
        for(String cleanSession : gymEnterprise.getAppointmentTime().getSessionList()){
            cbxTimeSlot.addItem(cleanSession);
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

        jLabel1 = new javax.swing.JLabel();
        lbltimeSlot = new javax.swing.JLabel();
        cbxTimeSlot = new javax.swing.JComboBox();
        btnConfirmCleanSession = new javax.swing.JButton();
        lblCleaningDate = new javax.swing.JLabel();
        cbxClnDateSel = new javax.swing.JComboBox();

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Welcome, Select a slot as per convenience...");

        lbltimeSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/clock.png"))); // NOI18N

        cbxTimeSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTimeSlotActionPerformed(evt);
            }
        });

        btnConfirmCleanSession.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        btnConfirmCleanSession.setText("Confirm");
        btnConfirmCleanSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmCleanSessionActionPerformed(evt);
            }
        });

        lblCleaningDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/calendar.png"))); // NOI18N

        cbxClnDateSel.setToolTipText("");
        cbxClnDateSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClnDateSelActionPerformed(evt);
            }
        });
        cbxClnDateSel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxClnDateSelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnConfirmCleanSession, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(347, 347, 347))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltimeSlot)
                            .addComponent(lblCleaningDate))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxClnDateSel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTimeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblCleaningDate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(cbxClnDateSel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbltimeSlot))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cbxTimeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnConfirmCleanSession, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTimeSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTimeSlotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTimeSlotActionPerformed

    private void cbxClnDateSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClnDateSelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxClnDateSelActionPerformed

    private void cbxClnDateSelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxClnDateSelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxClnDateSelKeyPressed

    private void btnConfirmCleanSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmCleanSessionActionPerformed
        
        JOptionPane.showMessageDialog(null,"Cleaning Session successfully booked");
        
    }//GEN-LAST:event_btnConfirmCleanSessionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmCleanSession;
    private javax.swing.JComboBox cbxClnDateSel;
    private javax.swing.JComboBox cbxTimeSlot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCleaningDate;
    private javax.swing.JLabel lbltimeSlot;
    // End of variables declaration//GEN-END:variables
}
