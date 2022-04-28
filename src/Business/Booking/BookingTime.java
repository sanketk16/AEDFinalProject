/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Booking;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author krishna
 */
public class BookingTime {
    Date date;
    private ArrayList<Date> dateList;
    private ArrayList<String> sessionList;

   
    public BookingTime(){
        
        dateList = new ArrayList();
        sessionList = new ArrayList();
        
        //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        DateFormat df = new SimpleDateFormat("yyyy-MM-DD");
        
        try
        {
            date = df.parse("2022-05-01");
        }
        
        catch(ParseException p){
            
        }
        
        Calendar dateCalendar = Calendar.getInstance();
        dateCalendar.setTime(date);
        
        for(int j = 0; j < 30; j++){
           
            dateCalendar.add(Calendar.DAY_OF_YEAR, 1);
            dateList.add(dateCalendar.getTime());
        }
        
//        sessionList.add("8:00 - 9:00");
//        sessionList.add("9:10 - 10:10");
//        sessionList.add("10:20 - 11:20");
//        sessionList.add("11:30 - 12:30");
//        sessionList.add("13:30 - 14:30");
//        sessionList.add("14:40 - 15:40");
//        sessionList.add("15:50 - 16:50");
//        sessionList.add("17:00 - 18:00");
        
        
        sessionList.add ("7 am to 8 am");
        sessionList.add ("9:30 am to 11 am");
        sessionList.add ("1 pm to 2 pm");
        sessionList.add ("2:30 pm to 4 pm");
        sessionList.add ("4 pm to 6 pm");
        sessionList.add ("7 pm to 8 pm");
    }
    
     public ArrayList<Date> getDateList() {
        return dateList;
    }

    public void setDateList(ArrayList<Date> dateList) {
        this.dateList = dateList;
    }

    public ArrayList<String> getSessionList() {
        return sessionList;
    }

    public void setSessionList(ArrayList<String> sessionList) {
        this.sessionList = sessionList;
    } 
}
