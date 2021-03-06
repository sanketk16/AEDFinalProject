/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Sales.Manager;

import Business.EcoSystem;
import Business.Enterprise.SalesEnterprise;
import Business.Network.Network;
import Business.Organization.SalesOrganization;
import Business.Accounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author krishna
 */
public class SalesManagerWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount account;
    private SalesOrganization salesorganization;
    private SalesEnterprise salesenterprise;
    private Network network;
    private EcoSystem ecoSystem;
    
    
    /**
     * Creates new form OSManagerWorkAreaJPanel
     */
    public SalesManagerWorkAreaJPanel(JPanel container, UserAccount account, 
            SalesOrganization salesorganization, SalesEnterprise salesenterprise, Network network, EcoSystem business) {
        initComponents();
        this.container = container;
        this.account = account;
        this.salesorganization = salesorganization;
        this.salesenterprise = salesenterprise;
        this.network = network;
        this.ecoSystem = ecoSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        manageListButton = new javax.swing.JButton();
        manageOrdersButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Welcome Sales Manager! Choose from following actions..");

        manageListButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        manageListButton.setForeground(new java.awt.Color(102, 102, 0));
        manageListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/items_gf.png"))); // NOI18N
        manageListButton.setText("Item Fleet..");
        manageListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageListButtonActionPerformed(evt);
            }
        });

        manageOrdersButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        manageOrdersButton.setForeground(new java.awt.Color(102, 102, 0));
        manageOrdersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/orderH.png"))); // NOI18N
        manageOrdersButton.setText("Orders..");
        manageOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setText("Manage ...");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel5.setText("Manage ...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(237, 237, 237))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(373, 373, 373))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel2)
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageListButtonActionPerformed
        // TODO add your handling code here:
        ManageProductListJPanel manageItemListJPanel = new ManageProductListJPanel(container, account, salesenterprise);
        container.add("manageListJPanel", manageItemListJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_manageListButtonActionPerformed

    private void manageOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersButtonActionPerformed
        // TODO add your handling code here:
        ManageOrderJPanel manageItemListJPanel = new ManageOrderJPanel(container, account, salesenterprise);
        container.add("manageItemJPanel", manageItemListJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_manageOrdersButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton manageListButton;
    private javax.swing.JButton manageOrdersButton;
    // End of variables declaration//GEN-END:variables
}
