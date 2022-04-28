/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author shreya
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Trainer.getValue())){
            organization = new TrainerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.GymManager.getValue())){
            organization  = new GymManagerOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Sales.getValue())){
            organization = new SalesOrganization();
            organizationList.add(organization);
            
        }
        else if(type.getValue().equals(Type.Analysis.getValue())){
            organization = new AnalysisOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        return organization;
        
    }
}