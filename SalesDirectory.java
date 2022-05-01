/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sales;

import java.util.ArrayList;

/**
 *
 * @author sanket
 */
public class SalesDirectory {
    private ArrayList<Sales> salesList;
    
    public SalesDirectory(){
        this.salesList = new ArrayList();
    }

//    public ArrayList<Sales> getOnlineSalesList() {
//        return onlineSalesList;
//    }
//
//    public void setOnlineSalesList(ArrayList<Sales> onlineSalesList) {
//        this.onlineSalesList = onlineSalesList;
//    }

    public ArrayList<Sales> getSalesList() {
        return salesList;
    }

    public void setSalesList(ArrayList<Sales> salesList) {
        this.salesList = salesList;
    }
}
