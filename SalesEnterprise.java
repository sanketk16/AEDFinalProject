/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Sales.SalesDirectory;
import Business.WorkQueue.SalesQueue;
import java.util.ArrayList;

/**
 *
 * @author krishna
 */
public class SalesEnterprise extends Enterprise{
    private SalesQueue salesQueue;
    private SalesDirectory salesDirectory;
    
    public SalesEnterprise(String name){
        super(name, Enterprise.EnterpriseType.Sales);
        this.salesDirectory = new SalesDirectory();
        
        salesQueue = new SalesQueue();
    }
    
    public ArrayList<Role> getSupportRole(){
        return null;
    }

    public SalesQueue getSalesQueue() {
        return salesQueue;
    }

    public void setSalesQueue(SalesQueue salesQueue) {
        this.salesQueue = salesQueue;
    }

    public SalesDirectory getSalesDirectory() {
        return salesDirectory;
    }

    public void setSalesDirectory(SalesDirectory salesDirectory) {
        this.salesDirectory = salesDirectory;
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("no support for that.");
    }
    
}
