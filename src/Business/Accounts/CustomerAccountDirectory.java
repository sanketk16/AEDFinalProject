/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Accounts;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import java.util.ArrayList;

/**
 *
 * @author sanket
 */
public class CustomerAccountDirectory extends UserAccountDirectory{
    private ArrayList<Customer> cusList;
    
    public CustomerAccountDirectory(){
        this.cusList = new ArrayList();
    }

//    public ArrayList<CustomerAccountDirectory> getCusDirectory() {
//        return cusDirectoryList;
//    }
//
//    public void setCusDirectory(ArrayList<CustomerAccountDirectory> cusDirectoryList) {
//        this.cusDirectoryList= cusDirectoryList;
//    }
//    
//    public Customer createCustomer(Integer cusId, String fullName, String address, String email, String phone, String membership){
//        Customer cusomer = new Customer(cusId, fullName, address, email, phone, membership);
//        Customer.getName(name);
//        cusDirectoryList.add(cusomer);
//        return customer;
//    }
    
}
