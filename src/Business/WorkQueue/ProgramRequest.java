/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.Program.Program;
import java.util.ArrayList;
/**
 *
 * @author shreya
 */
public class ProgramRequest extends WorkRequest{
    //private Program course;
    private Program program;
    private String result;
    //private Program courserequest;
    
//    public ProgramRequest(Program courserequest){
//    this.courserequest =  courserequest;
//}

    @Override
    public String toString(){
        
        return program.getProgramName();
    }
    
    public ProgramRequest(){
        program = new Program();
    }

//    public Program getCourse() {
//        return course;
//    }
//
//    public void setCourse(Program course) {
//        this.course = course;
//    }

   

    public void setProgram(Program program) {
        this.program = program;
    }
    
    

   

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    
//    public Program getCourserequest() {
//        return courserequest;
//    }
//
//    public void setCourserequest(Program courserequest) {
//        this.courserequest = courserequest;
//    }
    
    
    
}
