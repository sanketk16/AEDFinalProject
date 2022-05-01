/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.Program.ProgramReview;

/**
 *
 * @author krishna
 */
public class ProgramReviewRequest extends WorkRequest{
    //private ProgramReview coursereviewrequest;
    private ProgramReview programreviewrequest;
    
    public ProgramReviewRequest(ProgramReview programreview){
        this.programreviewrequest = programreviewrequest;
    }
    
    @Override
    public String toString(){
        return this.programreviewrequest.toString();
    }

//    public ProgramReview getCoursereview() {
//        return coursereviewrequest;
//    }
//
//    public void setCoursereview(ProgramReview coursereview) {
//        this.coursereviewrequest = coursereviewrequest;
//    }

    public ProgramReview getProgramreviewrequest() {
        return programreviewrequest;
    }

    public void setProgramreviewrequest(ProgramReview programreviewrequest) {
        this.programreviewrequest = programreviewrequest;
    }
    
    
    
    
}
