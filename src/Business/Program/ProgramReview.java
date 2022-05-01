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
public class ProgramReview {
    //private int customerId;
    private int courseId;
    private int sectionNumber;
    private String courseName;
    private String trainerName;
    private int reviewId;
    private static int count = 0;
    
    public ProgramReview(String coursename, String trainername, int reviewId){
        this.courseName = coursename;
        this.trainerName = trainername;
        reviewId = count;
        count++;
    }
    
    public String toString(){
        return this.courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        ProgramReview.count = count;
    }
    
    
}
