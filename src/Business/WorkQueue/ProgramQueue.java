/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author shreya
 */
public class ProgramQueue{
    //private ArrayList<CourseRequest> courseRequestList;
    private ArrayList<ProgramRequest> programRequestList;
    public ProgramQueue(){
        //this.courseRequestList = new ArrayList();
        this.programRequestList = new ArrayList();
    }

//    public ArrayList<CourseRequest> getCourseRequestList() {
//        return courseRequestList;
//    }
//
//    public void setCourseRequestList(ArrayList<CourseRequest> courseRequestList) {
//        this.courseRequestList = courseRequestList;
//    }
//    

    public ArrayList<ProgramRequest> getProgramRequestList() {
        return programRequestList;
    }

    public void setProgramRequestList(ArrayList<ProgramRequest> programRequestList) {
        this.programRequestList = programRequestList;
    }
    
    
}
