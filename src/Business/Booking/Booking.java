/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Booking;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sanket
 */
public class Booking {
    private Room classRoom;
    private String session;
    private Date date;
    
    public Booking(Date date, String session){
        classRoom = null;
        this.date = date;
        this.session = session;
    }
    
    @Override
    public String toString(){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String s = df.format(date);
        s = s + " " + session;
        return s;
    }

    public Room getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(Room classRoom) {
        this.classRoom = classRoom;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
