/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SalesRole;
import java.util.ArrayList;

/**
 *
 * @author sanket
 */
public class NewHireOrganization extends Organization{
    
    public NewHireOrganization() {
        super (Organization.Type.NewHire.getValue());
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SalesRole());
        return roles;
    }
}
