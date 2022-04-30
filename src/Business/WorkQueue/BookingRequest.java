/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Booking.Booking;

/**
 *
 * @author sanket
 */
public class BookingRequest extends WorkRequest{
    private Booking appointment;
    
    public BookingRequest(Booking appointment){
        this.appointment = appointment;
        
    }
    
    public String toString(){
        return this.appointment.toString();
    }

    public Booking getAppointment() {
        return appointment;
    }

    public void setAppointment(Booking appointment) {
        this.appointment = appointment;
    }
    
    
}
