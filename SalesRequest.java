/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Sales.Sales;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author krishna
 */
public class SalesRequest extends WorkRequest{
    private HashMap<Sales, Integer> productOrder;
//    private Sales sales;
//    
//    public SalesRequest(Sales sales){
//        this.sales = sales;
//    }
        
    
    @Override
    public String toString(){
        String result = "";
        for(Map.Entry<Sales, Integer> en : productOrder.entrySet())
            result = result + en.getKey().getProductName();
        return result;
    }
    
    public int getQuantity(){
        
        int qty = 0;
        
        for(Map.Entry<Sales, Integer> en: productOrder.entrySet())
            qty = qty + en.getValue();
        return qty;
    }
    
    public double getTotalPrice(){
        double price = 0;
        
        for(Map.Entry<Sales, Integer> en : productOrder.entrySet())
            price = price + en.getKey().getPrice() * en.getValue();
        return price;
    }

    public SalesRequest(){
        productOrder = new HashMap();
    }

//    public HashMap<Sales, Integer> getItemOrder() {
//        return itemOrder;
//    }
//
//    public void setItemOrder(HashMap<Sales, Integer> itemOrder) {
//        this.itemOrder = itemOrder;
//    }

    public HashMap<Sales, Integer> getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(HashMap<Sales, Integer> productOrder) {
        this.productOrder = productOrder;
    }   
}
