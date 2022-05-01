/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Accounts.UserAccount;
import UI.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author krishna
 */
public class SystemAdminRole extends Role{

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, EcoSystem ecosystem) {
//        return new SystemAdminWorkAreaJPanel(userProcessContainer, ecosystem);
//    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, business);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
