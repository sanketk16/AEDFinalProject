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
import Business.Organization.AnalysisOrganization;
import Business.Organization.Organization;
import Business.Accounts.UserAccount;
import javax.swing.JPanel;
import UI.Gym.Analyst.AnalysisJPanel;

/**
 *
 * @author sanket
 */
public class AnalystRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        SalesEnterprise ols = null;
//        for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
//            if(ent instanceof SalesEnterprise){
//                ols = (SalesEnterprise)ent;
//                break;
//            }
//        }
//        if(ols == null){
//            return null;
//        }
        return new AnalysisJPanel(userProcessContainer, (GymEnterprise)enterprise, ols);
    }
    
}
