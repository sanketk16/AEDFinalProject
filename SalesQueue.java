/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author krishna
 */
public class SalesQueue {
    private ArrayList<SalesRequest> onlinesalesRequestList;
    
    public SalesQueue(){
        this.onlinesalesRequestList = new ArrayList();
    }

    public ArrayList<SalesRequest> getOnlinesalesRequestList() {
        return onlinesalesRequestList;
    }

    public void setOnlinesalesRequestList(ArrayList<SalesRequest> onlinesalesRequestList) {
        this.onlinesalesRequestList = onlinesalesRequestList;
    }
    
    
    
}
