/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sales;

/**
 *
 * @author sanket
 */
public class Sales {
    private String productName;
    private int productID;
    private static int count = 0;
    private double price;
    
    public Sales(String productName, double price){
        this.productName = productName;
        this.price = price;
        productID = count;
        count++;
        
    }
    
    @Override
    public String toString(){
        return this.productName;
    }

//    public String getItemname() {
//        return itemname;
//    }
//
//    public void setItemname(String itemname) {
//        this.itemname = itemname;
//    }
//
//    public int getItemId() {
//        return itemId;
//    }
//
//    public void setItemId(int itemId) {
//        this.itemId = itemId;
//    }

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
    
    

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Sales.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }  
}
