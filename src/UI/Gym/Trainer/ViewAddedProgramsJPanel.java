/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Gym.Trainer;

import Business.Enterprise.GymEnterprise;
import Business.Program.Program;
import Business.Accounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shreya
 */
public class ViewAddedProgramsJPanel extends javax.swing.JPanel {
    
    private JPanel container;
    private UserAccount account;
    private GymEnterprise gymEnterprise;

    /**
     * Creates new form CourseViewJPanel
     */
    public ViewAddedProgramsJPanel(JPanel container, UserAccount account, GymEnterprise gymEnterprise) {
        this.container = container;
        this.account = account;
        this.gymEnterprise = gymEnterprise;
        initComponents();
        populateCourse();
    }
    public void populateCourse(){
        DefaultTableModel model = (DefaultTableModel) viewCourseJTable.getModel();
        
        model.setRowCount(0);
        for(Program course : gymEnterprise.getProgramDirectory().getProgramList()){
            Object[] row = new Object[2];
            row[0] = course.getProgramId();
            row[1] = course;
            model.addRow(row);
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

        btnBack = new javax.swing.JButton();
        deleteCourseButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewCourseJTable = new javax.swing.JTable();
        lblProgramList = new javax.swing.JLabel();

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/goback.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        deleteCourseButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        deleteCourseButton.setForeground(new java.awt.Color(255, 0, 0));
        deleteCourseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/minus.png"))); // NOI18N
        deleteCourseButton.setText("Remove Program");
        deleteCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCourseButtonActionPerformed(evt);
            }
        });

        viewCourseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Program ID", "Program Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewCourseJTable);

        lblProgramList.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        lblProgramList.setText("These are the current programs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(lblProgramList, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack)))
                .addGap(251, 251, 251))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(deleteCourseButton)
                .addGap(264, 264, 264))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblProgramList, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 357, Short.MAX_VALUE)
                .addComponent(deleteCourseButton)
                .addGap(3, 3, 3)
                .addComponent(btnBack)
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void deleteCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCourseButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewCourseJTable.getSelectedRow();
        if(selectedRow >= 0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Program course = (Program)viewCourseJTable.getValueAt(selectedRow, 1);
                gymEnterprise.getProgramDirectory().getProgramList().remove(course);
                populateCourse();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteCourseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton deleteCourseButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProgramList;
    private javax.swing.JTable viewCourseJTable;
    // End of variables declaration//GEN-END:variables

   
}
