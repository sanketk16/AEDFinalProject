/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Booking;

/**
 *
 * @author shreya
 */
public class Room {

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    private int number;
    private static int id = 100;
    
    public Room(){
        if(id % 100 == 4){
            id = id + 100 - 4;
        }
        id++;
        this.number = id;
    }
    
    public String toString(){
        return "" + number;
    }
}
