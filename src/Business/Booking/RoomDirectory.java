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
    
    public RoomDirectory(){
        this.classRoomList = new ArrayList();
        for(int i = 0; i < 25; i++){
            Room classRoom = new Room();
            this.classRoomList.add(classRoom);
        }
    }
    
    public ArrayList<Room> getClassRoomList(){
        return classRoomList;
    }
    
    public void setClassRoomList(ArrayList<Room> classRoomList){
        this.classRoomList = classRoomList;
    }
}
