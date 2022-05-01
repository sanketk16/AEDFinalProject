/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.TrainerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * 
 * 
 * @author sanket
 */
public class TrainerOrganization extends Organization{

    public TrainerOrganization() {
        super(Organization.Type.Trainer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TrainerRole());
        return roles;
    }
     
}