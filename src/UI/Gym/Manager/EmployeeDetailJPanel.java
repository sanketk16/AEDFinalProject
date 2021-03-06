/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Gym.Manager;

import Business.Employee.Employee;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author krishna
 */
public class EmployeeDetailJPanel extends javax.swing.JPanel {
    private JPanel container;
    private Employee employee;
    
    /**
     * Creates new form EmployeeDetailJPanel
     */
    public EmployeeDetailJPanel(JPanel container, Employee employee) {
        initComponents();
        this.employee = employee;
        this.container = container;
        
        txtEmpName.setText(employee.getName());
        txtEmpID.setText(String.valueOf(employee.getId()));
        
        String pg_name = employee.getProgram();
        //System.out.println (pg_name);
        txtProgram.setText(employee.getProgram());
        txtEvaluation.setText(employee.getEvaluation());
        txtEmployeeTitle.setText(employee.getJobtitle());
        txtPhNo.setText (employee.getPhoneNumber());
        
        // can't change these fields
        
        //txtProgram.setEditable(false);
        txtProgram.setEnabled(false);
        txtEmployeeTitle.setEnabled(false);
        txtEmpName.setEnabled(false);
        txtEmpID.setEnabled(false);
        txtEvaluation.setEnabled(false);  
        txtPhNo.setEnabled(false);
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
        txtEmpID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEvaluation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        backTxt = new javax.swing.JButton();
        btnUpdateDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        lblPrgName = new javax.swing.JLabel();
        txtProgram = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmployeeTitle = new javax.swing.JTextField();
        txtPhNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSaveDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Employee ID");

        txtEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Assessment");

        txtEvaluation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEvaluationActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Employee Details");

        backTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/goback.png"))); // NOI18N
        backTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backTxtActionPerformed(evt);
            }
        });

        btnUpdateDetails.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btnUpdateDetails.setForeground(new java.awt.Color(0, 51, 102));
        btnUpdateDetails.setText("Update employee details..");
        btnUpdateDetails.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnUpdateDetailsItemStateChanged(evt);
            }
        });
        btnUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailsActionPerformed(evt);
            }
        });

        jLabel1.setText("Employee Name");

        txtEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNameActionPerformed(evt);
            }
        });

        lblPrgName.setText("Program name");

        txtProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProgramActionPerformed(evt);
            }
        });

        jLabel6.setText("Employee Title");

        txtEmployeeTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeTitleActionPerformed(evt);
            }
        });

        jLabel7.setText("Phone No.");

        btnSaveDetails.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btnSaveDetails.setForeground(new java.awt.Color(0, 153, 153));
        btnSaveDetails.setText("Save");
        btnSaveDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(212, 212, 212)
                                .addComponent(btnUpdateDetails)
                                .addGap(63, 63, 63)
                                .addComponent(btnSaveDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPrgName)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtProgram, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                        .addComponent(txtEvaluation, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                        .addComponent(txtPhNo)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6))
                                    .addGap(69, 69, 69)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmployeeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(770, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmployeeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrgName)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtProgram)
                        .addGap(34, 34, 34)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(txtEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaveDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIDActionPerformed

    private void txtEvaluationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEvaluationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEvaluationActionPerformed

    private void backTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backTxtActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backTxtActionPerformed

    private void btnUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailsActionPerformed
        // TODO add your handling code here:
        txtEmpName.setEnabled(true);
        txtEmpID.setEnabled(false);
        txtEvaluation.setEnabled(true);
        txtEmployeeTitle.setEnabled(true);
        txtProgram.setEnabled(true);
        txtPhNo.setEnabled(true);
        
        btnUpdateDetails.setEnabled(false);
        
        employee.setJobtitle(txtEmployeeTitle.getText());

        if (txtEmployeeTitle.getText().equals("Trainer")){
        txtEmpName.setEnabled(true);
        txtEmpID.setEnabled(false);
        txtEvaluation.setEnabled(true);
        txtEmployeeTitle.setEnabled(false);
        txtProgram.setEnabled(true);
        txtPhNo.setEnabled(true);
        
//        btnUpdateDetails.setEnabled(false);
//        btnSaveAssess.setEnabled(true);
        
        //employee.setJobtitle(txtEmployeeTitle.getText());
        }
        
        else {
         txtProgram.setEnabled(false);
         txtEmpID.setEnabled(false);
         txtEmpName.setEnabled(true);
         txtEvaluation.setEnabled(true);
         txtEmployeeTitle.setEnabled(false);
         txtPhNo.setEnabled(false);
        }
    }//GEN-LAST:event_btnUpdateDetailsActionPerformed

    private void txtEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNameActionPerformed

    private void txtProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProgramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProgramActionPerformed

    private void txtEmployeeTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeTitleActionPerformed

    private void btnUpdateDetailsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnUpdateDetailsItemStateChanged
        
        if(txtEmployeeTitle.getText().equals("Trainer") || txtEmployeeTitle.getText().equals("Clerk"))
        {
            txtProgram.setEnabled(true);
        }
        
        else
        {
            txtProgram.setEnabled(false);
        }
        
        //txtProgram.setText(txtProgram.getText());
        employee.setProgram(txtProgram.getText());
    }//GEN-LAST:event_btnUpdateDetailsItemStateChanged

    private void btnSaveDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDetailsActionPerformed
        // TODO add your handling code here:
        txtEmpName.setEditable(false);
        txtEmpID.setEditable(false);
        txtProgram.setEditable(false);
        txtEvaluation.setEditable(false);

        btnSaveDetails.setEnabled(false);
        btnUpdateDetails.setEnabled(true);

        
        String pg_name = txtProgram.getText ();
        
        employee.setProgram(pg_name);
        
        String phno = txtPhNo.getText();
        
        employee.setPhoneNumber(phno);
        
        JOptionPane.showMessageDialog(null, "Employee details updated successfully");
        
    }//GEN-LAST:event_btnSaveDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backTxt;
    private javax.swing.JButton btnSaveDetails;
    private javax.swing.JButton btnUpdateDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblPrgName;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmployeeTitle;
    private javax.swing.JTextField txtEvaluation;
    private javax.swing.JTextField txtPhNo;
    private javax.swing.JTextField txtProgram;
    // End of variables declaration//GEN-END:variables
}
