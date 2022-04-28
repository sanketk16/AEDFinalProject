/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GymEnterprise;
import Business.Enterprise.SalesEnterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.GymManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.Gym.Manager.GymManagerWorkAreaJPanel;

/**
 *
 * @author shreya
 */
public class GymManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
         return new GymManagerWorkAreaJPanel(userProcessContainer, account, (GymManagerOrganization)organization, 
                 (GymEnterprise)enterprise,network, business);
    }
    
}
