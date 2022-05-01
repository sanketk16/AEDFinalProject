/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Accounts;

import Business.Employee.Employee;
import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.BookingQueue;
import Business.WorkQueue.ProgramQueue;
import Business.WorkQueue.SalesQueue;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author shreya
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Person person;
    private Role role;
    private WorkQueue workQueue;
    private SalesQueue salesQueue;
    private BookingQueue appointmentQueue;
    //private ProgramQueue courseQueue;
    private ProgramQueue programQueue;
    
    public UserAccount() {
        workQueue = new WorkQueue();
        programQueue = new ProgramQueue();
        appointmentQueue = new BookingQueue();
        salesQueue = new SalesQueue();
    }

//    public SalesQueue getOnlineSalesQueue() {
//        return onlineSalesQueue;
//    }
//
//    public void setOnlineSalesQueue(SalesQueue onlineSalesQueue) {
//        this.onlineSalesQueue = onlineSalesQueue;
//    }

    public SalesQueue getSalesQueue() {
        return salesQueue;
    }

    public void setSalesQueue(SalesQueue salesQueue) {
        this.salesQueue = salesQueue;
    }
    
    
    public BookingQueue getAppointmentQueue() {
        return appointmentQueue;
    }

    public void setAppointmentQueue(BookingQueue appointmentQueue) {
        this.appointmentQueue = appointmentQueue;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

//    public ProgramQueue getCourseQueue() {
//        return courseQueue;
//    }
//
//    public void setCourseQueue(ProgramQueue courseQueue) {
//        this.courseQueue = courseQueue;
//    }

    public ProgramQueue getProgramQueue() {
        return programQueue;
    }

    public void setProgramQueue(ProgramQueue programQueue) {
        this.programQueue = programQueue;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
}