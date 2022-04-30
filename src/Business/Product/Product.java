/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Product;

/**
 *
 * @author sanket
 */
public class Product {
    private String productName;
    private int productID;
    private int availabilty;
    
    
    public Product(String productName, int productID, int availabilty){
        this.productName = productName;
        this.productID = productID;
        this.availabilty = availabilty;
    }
    
    @Override
    public String toString(){
        return this.productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getAvailabilty() {
        return availabilty;
    }

    public void setAvailabilty(int availabilty) {
        this.availabilty = availabilty;
    }
    
    
}
