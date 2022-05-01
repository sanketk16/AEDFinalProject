/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GymEnterprise;
import Business.Network.Network;
import Business.Organization.ClerkOrganization;
import Business.Organization.Organization;
import Business.Organization.TrainerOrganization;
import Business.Accounts.UserAccount;
import javax.swing.JPanel;
import UI.Gym.Clerk.ClerkWorkAreaJPanel;
import UI.Gym.Trainer.TrainerWorkAreaJPanel;

/**
 *
 * @author sanket
 */
public class ClerkRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new ClerkWorkAreaJPanel(userProcessContainer, account, (ClerkOrganization)organization, (GymEnterprise)enterprise, network, business);
    
 }
}
