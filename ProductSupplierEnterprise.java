/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Product.Product;
import Business.Product.ProductFleet;
import Business.WorkQueue.ProductAvailabilityQueue;
import java.util.ArrayList;

/**
 *
 * @author krishna
 */
public class ProductSupplierEnterprise extends Enterprise{
    private ProductAvailabilityQueue productAvailabilityQueue;
    private ProductFleet productFleet;
    
    public ProductSupplierEnterprise(String name){
        super (name, Enterprise.EnterpriseType.ProductSupplier);
        this.productFleet = new ProductFleet();
        productAvailabilityQueue = new ProductAvailabilityQueue ();
    }
    
    public ArrayList<Role> getSupportRole(){
        return null;
    }

    public ProductAvailabilityQueue getProductAvailabilityQueue() {
        return productAvailabilityQueue;
    }

    public void setProductAvailabilityQueue(ProductAvailabilityQueue productAvailabilityQueue) {
        this.productAvailabilityQueue = productAvailabilityQueue;
    }

    public ProductFleet getProductFleet() {
        return productFleet;
    }

    public void setProductFleet(ProductFleet productFleet) {
        this.productFleet = productFleet;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
