/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Accounts.UserAccountDirectory;

/**
 *
 * @author sanket
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private UserAccountDirectory userAccountDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        userAccountDirectory = new UserAccountDirectory();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    
    @Override
    public String toString(){
        return name;
    }

    
    public boolean getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
