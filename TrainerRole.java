/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GymEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.TrainerOrganization;
import Business.Accounts.UserAccount;
import javax.swing.JPanel;
import UI.Gym.Trainer.TrainerWorkAreaJPanel;

/**
 *
 * @author krishna
 */
public class TrainerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new TrainerWorkAreaJPanel(userProcessContainer, account, (TrainerOrganization)organization, (GymEnterprise)enterprise, network, business);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
