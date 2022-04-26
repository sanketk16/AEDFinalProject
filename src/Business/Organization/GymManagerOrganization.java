/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.GymManagerRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author krishna
 */
public class GymManagerOrganization extends Organization {
    public GymManagerOrganization() {
        super(Organization.Type.GymManager.getValue());
    }

    @Override
   public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GymManagerRole());
        return roles;
    }
}
