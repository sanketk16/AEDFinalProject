/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Program.ProgramReview;
import java.util.ArrayList;



/**
 *
 * @author shreya
 */
public class ProgramReviewQueue {
    private ArrayList<ProgramReviewRequest> classReviewRequestList;
    
    public ProgramReviewQueue(ProgramReview classreviewrequest){
        this.classReviewRequestList = new ArrayList();
    }

    public ArrayList<ProgramReviewRequest> getClassReviewRequestList() {
        return classReviewRequestList;
    }

    public void setClassReviewRequestList(ArrayList<ProgramReviewRequest> classReviewRequestList) {
        this.classReviewRequestList = classReviewRequestList;
    }
    
    
}
