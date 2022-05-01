/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;


import Business.Role.AnalystRole;
import Business.Accounts.UserAccount;
import java.util.ArrayList;


/**
 *
 * @author shreya
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
        
        
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public boolean isEmployeeExist(Employee emp) {
        if (!this.employeeList.isEmpty()) {
            for (Employee em : this.employeeList) {
                if (em.getId() == emp.getId()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public Employee createEmployee(String name, String phoneNumber, String email, String address, String course, String evaluation){
        Employee employee = new Employee(name, phoneNumber, email);
        //employee.setName(name);
        employeeList.add(employee);
        
       
        return employee;
    }

    
//       public boolean checkIfUsernameIsUnique(String username){
//        for (Employee ua : employeeList){
//            if(ua.g==null)continue;
////            if(ua==null)System.out.println("ua is null");
////            if(ua.getUsername()==null)System.out.println("name is nul;l");
//            if (ua.getUsername().equals(username))
//                return false;
//        }
//        return true;
//    }

//    public Employee createEmployee(String name, String account, String password, AnalystRole analysisRole) {
//         UserAccount ac = new UserAccount();
//         ac.setUsername(account);
//         ac.setPassword(password);
//         ac.setRole(analysisRole);
//         userAccountList.add(ac);
//         return ac;
//    }
//    }
}