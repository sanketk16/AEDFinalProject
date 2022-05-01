/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Program;

import java.util.ArrayList;

/**
 *
 * @author shreya
 */
public class ProgramDirectory {
    //private ArrayList<Program> courseList;
    private ArrayList<Program> programList;
    
    public ProgramDirectory(){
        this.programList = new ArrayList();
}

//    public ArrayList<Program> getCourseList() {
//        return courseList;
//    }
//
//    public void setCourseList(ArrayList<Program> courseList) {
//        this.courseList = courseList;
//    }

    public ArrayList<Program> getProgramList() {
        return programList;
    }

    public void setProgramList(ArrayList<Program> programList) {
        this.programList = programList;
    }  
    
}
