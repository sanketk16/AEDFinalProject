/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.ClerkRole;
import Business.Role.Role;
import Business.Role.TrainerRole;
import java.util.ArrayList;


/**
 *
 * @author sanket
 */
public class ClerkOrganization extends Organization{
    
    public ClerkOrganization() {
        super(Organization.Type.Clerk.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClerkRole());
        return roles;
    }
}
