/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Program;

/**
 *
 * @author sanket
 */
public class Program {
    private String difficulties;
    //private int courseId;
    private int programID;
    //private int sectionNumber;
    private static int count = 0; //youwenti
    private String programName;
    private int remainSeats;
    //private String type;(public class& private class)
    
    public Program(String programName, int remainSeats, String difficulties){
        this.programName = programName;
        this.remainSeats = remainSeats;
        this.difficulties = difficulties;
        programID = count;
        count++;
    }

    public Program() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return this.programName;
    }
    
    public String getDifficulties() {
        return difficulties;
    }

    public void setDifficulties(String difficulties) {
        this.difficulties = difficulties;
    }
    
//    public int getCourseId() {
//        return courseId;
//    }
//
//    public void setCourseId(int classId) {
//        this.courseId = courseId;
//    }
    
    public int getProgramId() {
        return programID;
    }

    public void setProgramId(int classId) {
        this.programID = programID;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

//    public int getSectionNumber() {
//        return sectionNumber;
//    }
//
//    public void setSectionNumber(int sectionNumber) {
//        this.sectionNumber = sectionNumber;
//    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Program.count = count;
    }

//    public String getCourseName() {
//        return courseName;
//    }
//
//    public void setCourseName(String coursename) {
//        this.courseName = coursename;
//    }

    public int getRemainSeats() {
        return remainSeats;
    }

    public void setRemainSeats(int remainSeats) {
        this.remainSeats = remainSeats;
    }

    
    
    
}
