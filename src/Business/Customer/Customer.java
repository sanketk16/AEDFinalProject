/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author sanket
 */
public class Customer {
    private int cusId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String address;
    private String phone;
    private String email;
    private String membership;
    private static int count = 0;
    
    public Customer(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        //this.fullName = firstName + " " + lastName;
        this.address = "";
        this.email = email;
        this.phone = phone;
        this.membership = membership;
        cusId = count;
        count++;
    }

    public int getCusId() {
        return cusId;
    }

    public void setName(String Name){
        String [] names = Name.split(" ");
        this.firstName = names[0];
        this.lastName = names[1];
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
    
    
    
    
}
