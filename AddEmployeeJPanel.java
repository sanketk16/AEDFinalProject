/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Gym.Manager;

import Business.Program.Program;
import Business.Employee.Employee;
import Business.Enterprise.GymEnterprise;
import Business.Network.Network;
import Business.Role.AnalystRole;
import Business.Role.ClerkRole;
import Business.Role.TrainerRole;
import Business.Accounts.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sanket
 */
public class AddEmployeeJPanel extends javax.swing.JPanel {

    private JPanel container;
    //private GymEnterprise fitenterprise;
    private GymEnterprise gymEnterprise;
    private Network network;
    
    //public String pg_name;

    /**
     * Creates new form AddEmployeeJPanel
     */
    public AddEmployeeJPanel(JPanel container, GymEnterprise gymEnterprise, Network network) {
        initComponents();
        this.container = container;
        this.gymEnterprise = gymEnterprise;
        this.network = network;
//        idTxt.setText(String.valueOf());  //有问题
        idTxt.setEditable(true);
        populatecombobox();
    }

    public void populatecombobox() {
        cb_ProgramName.removeAll();
        for (Program courselist : gymEnterprise.getProgramDirectory().getProgramList()) {
            cb_ProgramName.addItem(String.valueOf(courselist));
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

        jLabel8 = new javax.swing.JLabel();
        PassField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        backTxt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cb_ProgramName = new javax.swing.JComboBox<>();
        accountTxt = new javax.swing.JTextField();
        cb_JobTitle = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        idTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        phoneNumberTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        RePasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setBackground(new java.awt.Color(255, 255, 255));

        PassField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Castellar", 0, 18)); // NOI18N
        jLabel5.setText("Fill in details for the new employee..");

        nameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        backTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/goback.png"))); // NOI18N
        backTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("Program");

        cb_ProgramName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));
        cb_ProgramName.setBorder(new javax.swing.border.MatteBorder(null));
        cb_ProgramName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ProgramNameActionPerformed(evt);
            }
        });

        accountTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        accountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTxtActionPerformed(evt);
            }
        });

        cb_JobTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analyst", "Trainer", "Clerk" }));
        cb_JobTitle.setBorder(new javax.swing.border.MatteBorder(null));
        cb_JobTitle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_JobTitleItemStateChanged(evt);
            }
        });
        cb_JobTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_JobTitleActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setText("Employee ID");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Employee phone no.");

        phoneNumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTxtActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Employee Email ID");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Employee address");

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(51, 204, 0));
        submitButton.setText("Save details and add employee!");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(submitButton)))
                .addGap(505, 505, 505))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(268, 268, 268)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        RePasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("User ID");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("Password");

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setText("Re-enter the password");

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel7.setText("Title");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(backTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(250, 250, 250))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(83, 83, 83)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_JobTitle, 0, 165, Short.MAX_VALUE)
                            .addComponent(cb_ProgramName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accountTxt)
                            .addComponent(nameTxt)
                            .addComponent(PassField)
                            .addComponent(RePasswordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RePasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_JobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_ProgramName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(backTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void backTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backTxtActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EmployeeViewJPanel employeeViewJPanel = (EmployeeViewJPanel) component;
        employeeViewJPanel.populateEmployee();
        layout.previous(container);
    }//GEN-LAST:event_backTxtActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        // Book book = new Book(nameTxt.getText());

        //,Integer.parseInt(storageTxt.getText()
        if (nameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "User name can't be empty!");
            return;
        }
        if (PassField.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Password can't be empty!");
            return;
        }
        if (RePasswordField.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Confirm Password can't be empty!");
            return;
        }

        if (phoneNumberTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Phone number can't be empty!");
            return;
        }
        if (emailTxt.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Email can't be empty!");
            return;
        }
        if (!checkEmailPattern()) {
            JOptionPane.showMessageDialog(null, "Email must follow the format");
            return;
        }
        if (!passwordPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Password must follow the format");
            return;
        }
        if (!PassField.getText().equals(RePasswordField.getText())) {
            JOptionPane.showMessageDialog(null, "The password does not match");
            return;
        }
//        if (!phonePattern()) {
//            JOptionPane.showMessageDialog(null, "Please follow the phone number format");
//            return;
//        }
        if (nameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "please add all the mandatory fields");
        } else {
            try {

                Integer d = Integer.parseInt(idTxt.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Only Integer allowed as ID");
                return;
            }
            
            
            Employee employee = new Employee(nameTxt.getText(), phoneNumberTxt.getText(),
                    emailTxt.getText(), addressTxt.getText(), String.valueOf(cb_ProgramName.getSelectedItem()), Integer.parseInt(idTxt.getText()), accountTxt.getText(), PassField.getText(), String.valueOf(cb_JobTitle.getSelectedItem()));
            //this.network = (Network) NetworkCMB.getSelectedItem();
            gymEnterprise.getEmployeeDirectory().getEmployeeList().add(employee);
            
            if(cb_JobTitle.getSelectedItem().equals("Analyst")){
            UserAccount ua = gymEnterprise.getUserAccountDirectory().createAnalysisAcount(accountTxt.getText(), RePasswordField.getText(), new AnalystRole());
            }
            if (cb_JobTitle.getSelectedItem().equals("Clerk")){
            UserAccount ua = gymEnterprise.getUserAccountDirectory().createClerkAccount(accountTxt.getText(), RePasswordField.getText(), new ClerkRole());
            }
            else
            {
            UserAccount ua = gymEnterprise.getUserAccountDirectory().createTrainerAcount(accountTxt.getText(), RePasswordField.getText(), new TrainerRole());
            }
            nameTxt.setText("");
            phoneNumberTxt.setText("");
            emailTxt.setText("");
            addressTxt.setText("");
            cb_ProgramName.setSelectedItem("");
            accountTxt.setText("");
            PassField.setText("");
            RePasswordField.setText("");
            cb_JobTitle.setSelectedItem("");
            
            String pg_name = String.valueOf(cb_ProgramName.getSelectedItem());
            //System.out.println (pg_name);
            JOptionPane.showMessageDialog(null, "Add successfully");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private Boolean checkEmailPattern() {
        String validName = "^[A-Z0-9a-z]+\\w*@[A-Z0-9a-z]+(\\.[A-Z0-9a-z]+)*$";
        Pattern p = Pattern.compile(validName);
        Matcher m = p.matcher(emailTxt.getText());
        boolean b = m.matches();

        return b;
    }

    private boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = p.matcher(PassField.getText());
        boolean b = m.matches();

        return b;
    }

    private boolean phonePattern() {
        Pattern p = Pattern.compile("^(\\+?1)?[2-9]\\d{2}[2-9](?!11)\\d{6}$");
        //"^(\\+?1)?[2-9]\\d{2}[2-9](?!11)\\d{6}$"
        Matcher m = p.matcher(phoneNumberTxt.getText());
        boolean b = m.matches();
        return b;
    }

    private void cb_ProgramNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ProgramNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cb_ProgramNameActionPerformed

    private void accountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountTxtActionPerformed

    private void cb_JobTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_JobTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_JobTitleActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void phoneNumberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTxtActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
        setEnabled(false);
    }//GEN-LAST:event_idTxtActionPerformed

    private void cb_JobTitleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_JobTitleItemStateChanged
        // TODO add your handling code here:
        if (cb_JobTitle.getSelectedItem().toString().equals("Analyst") || cb_JobTitle.getSelectedItem().toString().equals("Clerk")) {
            cb_ProgramName.setEnabled(false);
            cb_ProgramName.setSelectedItem(" ");
        }
        else 
        {
            cb_ProgramName.setEnabled(true);
        }
    }//GEN-LAST:event_cb_JobTitleItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PassField;
    private javax.swing.JPasswordField RePasswordField;
    private javax.swing.JTextField accountTxt;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backTxt;
    private javax.swing.JComboBox<String> cb_JobTitle;
    private javax.swing.JComboBox<String> cb_ProgramName;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
