/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Booking;

import java.util.ArrayList;

/**
 *
 * @author shreya
 */
public class RoomDirectory {
    private ArrayList<Room> classRoomList;
    
    
    public ArrayList<Room> getClassRoomList(){
        return classRoomList;
    }
    
    public void setClassRoomList(ArrayList<Room> classRoomList){
        this.classRoomList = classRoomList;
    }
}
