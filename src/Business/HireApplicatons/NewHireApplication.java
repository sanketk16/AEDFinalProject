/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HireApplications;

/**
 *
 * @author sanket
 */
public class NewHireApplication {
    
    private int applicationID;
    private String username;
    private String position;
    
    public NewHireApplication (String username, String position) {
        this.username = username;
        this.position = position;
    }

    public int getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(int applicationID) {
        this.applicationID = applicationID;
    }
    
    
    
}
