/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Customer.Customer;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Accounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import UI.MainJFrame;
import UI.Customer.NewCustomerRegJPanel;
import Business.Role.CustomerRole;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;

/**
 *
 * @author shreya
 */
public class NewCustomerRegJPanel extends javax.swing.JPanel {

    private JPanel crpJPanel;
    private String username;
    private String password;
    private EcoSystem system;
    private Network network;
    private MainJFrame frame;

    /**
     * Creates new form CusRegistrationJPanel
     */
    public NewCustomerRegJPanel(EcoSystem system, JPanel crpJPanel, MainJFrame frame) {
        initComponents();
        this.system = system;
        this.crpJPanel = crpJPanel;
        this.frame = frame;
        NetworkCMB.removeAllItems();
        for (Network network : system.getNetworkList()) {
            NetworkCMB.addItem(network);
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
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        firstNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        PassField = new javax.swing.JPasswordField();
        CPassField = new javax.swing.JPasswordField();
        NetworkCMB = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Come");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(0, 204, 153));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 720, 112, 50));

        cancelButton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 153, 153));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 720, 112, 50));

        firstNameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 165, -1));

        lastNameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 165, -1));

        addressTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 336, -1));

        phoneTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });
        add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 165, -1));

        emailTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 165, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Fill in Registration details..");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 21, 453, -1));

        userNameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });
        add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 165, -1));

        PassField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(PassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 165, -1));

        CPassField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPassFieldActionPerformed(evt);
            }
        });
        add(CPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 165, -1));

        NetworkCMB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NetworkCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkCMBActionPerformed(evt);
            }
        });
        add(NetworkCMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, 165, 35));

        jLabel10.setText("User name");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel11.setText("First Name");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jLabel12.setText("Last Name");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, 18));

        jLabel13.setText("Password");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jLabel14.setText("Re-enter the password");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, 30));

        jLabel15.setText("Address");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        jLabel16.setText("Phone Number");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, -1));

        jLabel17.setText("Email");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, -1, -1));

        jLabel18.setText("Network");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/regis.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 70, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (userNameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "User name can't be empty!");
            return;
        }
        if (PassField.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Password can't be empty!");
            return;
        }
        
        if(!phonePattern()){
            JOptionPane.showMessageDialog(null, "Please follow the phone number format");
            return;
        }

        username = userNameTxt.getText();
        password = CPassField.getText();

        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(username, password);

        if (userAccount == null) {
            for (Network network : system.getNetworkList()) {
                userAccount = network.getUserAccountDirectory().authenticateUser(username, password);
                if (userAccount == null) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(username, password);
                        if (userAccount == null) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                userAccount = organization.getUserAccountDirectory().authenticateUser(username, password);
                                if (userAccount != null) {
                                    JOptionPane.showMessageDialog(null, "Account already exist!");
                                    userNameTxt.setText("");
                                    PassField.setText("");
                                    CPassField.setText("");
//                                firstNameTxt.setText("");
//                                lastNameTxt.setText("");
                                    return;
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Account already exist!");
                            userNameTxt.setText("");
                            PassField.setText("");
                            CPassField.setText("");
                            return;

                        }
                        //UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(username, password);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Account already exist!");
                    userNameTxt.setText("");
                    PassField.setText("");
                    CPassField.setText("");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Account already exist!");
            userNameTxt.setText("");
            PassField.setText("");
            CPassField.setText("");
            return;

        }

        Customer customer = new Customer(firstNameTxt.getText(), lastNameTxt.getText(),
                emailTxt.getText(), phoneTxt.getText());
        this.network = (Network) NetworkCMB.getSelectedItem();
        UserAccount ua = network.getUserAccountDirectory().createUserAccount(userNameTxt.getText(), CPassField.getText(), customer, new CustomerRole());

        //DB4OUtil.getInstance().storeSystem(system);
        JOptionPane.showMessageDialog(null, "Create Account Successfully");
        userNameTxt.setEnabled(false);
        PassField.setEnabled(false);
        CPassField.setEnabled(false);
        firstNameTxt.setEnabled(false);
        lastNameTxt.setEnabled(false);
        addressTxt.setEnabled(false);
        phoneTxt.setEnabled(false);
        emailTxt.setEnabled(false);
        frame.setActivate();
//        String username = userNameTxt.getText();
//        char[] passwordCharArray1 = PassField.getPassword();
//        String pass1 = String.valueOf(passwordCharArray1);
//        char[] passwordCharArray2 = CPassField.getPassword();
//        String pass2 = String.valueOf(passwordCharArray2);
//
//        if (system.checkIfUserIsUnique(username)) {
//            if (pass1.equals(pass2)) {
//                //this.frame.setSize(500, 430);
//                NewCustomerRegJPanel cp = new NewCustomerRegJPanel(this.system, this.crpJPanel);
//                this.crpJPanel.add("NewCustomerRegJPanel", cp);
//                CardLayout layout = (CardLayout) this.crpJPanel.getLayout();
//                crpJPanel.remove(this);
//                layout.next(this.crpJPanel);
//            } else {
//                JOptionPane.showMessageDialog(null, "Passwords don't match!");
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Username already exists!");
//        }
//        
//        this.frame.dispose();
//        MainJFrame mf = new MainJFrame();
//        this.frame.dispose();
//        mf.setVisible(true);
//        mf.setLocationRelativeTo(null);

    }//GEN-LAST:event_submitButtonActionPerformed
    private Boolean checkEmailPattern(){
        String validName = "^[A-Z0-9a-z]+\\w*@[A-Z0-9a-z]+(\\.[A-Z0-9a-z]+)*$";
        Pattern p = Pattern.compile(validName);
        Matcher m = p.matcher(emailTxt.getText());
        boolean b = m.matches();
        
        return b;
    }

private boolean passwordPatternCorrect(){
        Pattern p = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
//                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$]"
        Matcher m = p.matcher(PassField.getText());
        boolean b = m.matches();
        
        return b;
    }
private boolean phonePattern(){
        Pattern p = Pattern.compile("^(\\+?1)?[2-9]\\d{2}[2-9](?!11)\\d{6}$");
                //"^(\\+?1)?[2-9]\\d{2}[2-9](?!11)\\d{6}$"
        Matcher m = p.matcher(phoneTxt.getText());
        boolean b = m.matches();
        
        return b;
    }
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        CancelJPanel cp = new CancelJPanel(this.system, this.crpJPanel);
        this.crpJPanel.add("CancelJPanel", cp);
        CardLayout layout = (CardLayout) this.crpJPanel.getLayout();
        crpJPanel.remove(this.crpJPanel);
        layout.next(crpJPanel);
        frame.setActivate();
//        firstNameTxt.setEnabled(false);
//        lastNameTxt.setEnabled(false);
//        addressTxt.setEnabled(false);
//        phoneTxt.setEnabled(false);
//        emailTxt.setEnabled(false);

    }//GEN-LAST:event_cancelButtonActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void CPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPassFieldActionPerformed

    private void NetworkCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkCMBActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_NetworkCMBActionPerformed

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CPassField;
    private javax.swing.JComboBox NetworkCMB;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
