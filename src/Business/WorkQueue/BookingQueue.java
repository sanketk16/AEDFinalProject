/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author sanket
 */
public class BookingQueue {
    private ArrayList<BookingRequest> appointmentRequestList;
    
    public BookingQueue(){
        this.appointmentRequestList = new ArrayList();
        
    }

    public ArrayList<BookingRequest> getAppointmentRequestList() {
        return appointmentRequestList;
    }

    public void setAppointmentRequestList(ArrayList<BookingRequest> appointmentRequestList) {
        this.appointmentRequestList = appointmentRequestList;
    }
    
    
}
