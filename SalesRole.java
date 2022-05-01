/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SalesEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.SalesOrganization;
import Business.Accounts.UserAccount;
import javax.swing.JPanel;
import UI.Sales.Manager.SalesAdminLoginJPanel;
import UI.Sales.Manager.SalesManagerWorkAreaJPanel;

/**
 *
 * @author krishna
 */
public class SalesRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new SalesAdminLoginJPanel(userProcessContainer, (SalesEnterprise) enterprise);
    }
    
}
