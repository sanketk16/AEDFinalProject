package Business;

import Business.Appointment.Appointment;
import Business.Appointment.ClassRoom;
import Business.Course.Course;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Enterprise.FitnessClubEnterprise;
import Business.Enterprise.OnlineSalesEnterprise;
import Business.Network.Network;
import Business.Organization.TrainerOrganization;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.OnlineSales;
import Business.Organization.SalesOrganization;
import Business.Role.Role;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.OnlineSalesRole;
import Business.Role.TrainerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentRequest;
import Business.WorkQueue.CourseRequest;
import Business.WorkQueue.CourseReviewRequest;
import Business.Person.Customer;
import Business.Person.Person;
import Business.Role.AnalysisRole;
import Business.Sales.OnlineSales;
import Business.Role.FitnessClubManagerRole;
import Business.WorkQueue.OnlineSalesRequest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanket
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        Person person = system.getPersonDirectory().createPerson("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
        
       UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("sys1", "sys1", person1, new SystemAdminRole());
        
        testData(system);
        return system;
    }
    
    public static void testData(EcoSystem system){
        Network network = new Network();  
        network.setName("FitnessClub");
        system.getNetworkList().add(network);
        
        
        FitnessClubEnterprise fitEnterprise = (FitnessClubEnterprise) network.getEnterpriseDirectory().createAndAddEnterprise("FitEnterprise", Enterprise.EnterpriseType.FitnessClub);

        
        OnlineSalesEnterprise onlinesalesEnterprise = (OnlineSalesEnterprise) network.getEnterpriseDirectory().createAndAddEnterprise("Sales", Enterprise.EnterpriseType.OnlineSales);

        
        ArrayList<Course> courseList = fitEnterprise.getCourseDirectory().getCourseList();
        takeCourse(courseList);//zhushihuilai
        
        Organization fitOrganization = fitEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.FitnessClubManager);
        Person fitnessclubManager1 = fitOrganization.getPersonDirectory().createPerson("Jessy Manager");
        UserAccount ua11 = fitOrganization.getUserAccountDirectory().createUserAccount("manager1", "manager1", fitnessclubManager1, new FitnessClubManagerRole());
        
        Person fitnessclubManager2 = fitOrganization.getPersonDirectory().createPerson("James Manager");
        UserAccount ua12 = fitOrganization.getUserAccountDirectory().createUserAccount("manager2", "manager2", fitnessclubManager2, new FitnessClubManagerRole());
        
        Organization anaOrganization = fitEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Analysis);
        Person fitnessclubAnalyst1 = fitOrganization.getPersonDirectory().createPerson("Xianling Zhao");
        UserAccount ua66 = fitOrganization.getUserAccountDirectory().createUserAccount("ana1", "ana1", fitnessclubAnalyst1, new AnalysisRole());

        
        Organization cusOrganization = fitEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
        Person cus1 = cusOrganization.getPersonDirectory().createPerson("Lily Customer");
        UserAccount ua1 = cusOrganization.getUserAccountDirectory().createUserAccount("cus1", "cus1", cus1, new CustomerRole());
        
        Person cus2 = cusOrganization.getPersonDirectory().createPerson("John Customer");
        UserAccount ua2 = cusOrganization.getUserAccountDirectory().createUserAccount("cus2", "cus2", cus2, new CustomerRole());
        
        Person cus3 = cusOrganization.getPersonDirectory().createPerson("Bob Customer");
        UserAccount ua3 = cusOrganization.getUserAccountDirectory().createUserAccount("cus3", "cus3", cus3, new CustomerRole());
        
        Person cus4 = cusOrganization.getPersonDirectory().createPerson("Bill Customer");
        UserAccount ua33 = cusOrganization.getUserAccountDirectory().createUserAccount("cus4", "cus4", cus4, new CustomerRole());
        
        Person cus5 = cusOrganization.getPersonDirectory().createPerson("Kevin Customer");
        UserAccount ua44 = cusOrganization.getUserAccountDirectory().createUserAccount("cus5", "cus5", cus5, new CustomerRole());
        
        Person cus6 = cusOrganization.getPersonDirectory().createPerson("Nina Customer");
        UserAccount ua55 = cusOrganization.getUserAccountDirectory().createUserAccount("cus6", "cus6", cus6, new CustomerRole());
        
        Person cus7 = cusOrganization.getPersonDirectory().createPerson("Rachel Customer");
        cusOrganization.getUserAccountDirectory().createUserAccount("cus7", "cus7", cus7, new CustomerRole());
        
        Organization trainerOrganization = fitEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Trainer);
        Person trainer1 = trainerOrganization.getPersonDirectory().createPerson("Jessica Trainer");
        UserAccount ua4 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer1", "trainer1", trainer1, new TrainerRole());
        
        Person trainer2 = trainerOrganization.getPersonDirectory().createPerson("Will Trainer");
        UserAccount ua5 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer2", "trainer2", trainer2, new TrainerRole());
        
        Person trainer3 = trainerOrganization.getPersonDirectory().createPerson("Dalton Trainer");
        UserAccount ua6 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer3", "trainer3", trainer3, new TrainerRole());
        
        Person trainer4 = trainerOrganization.getPersonDirectory().createPerson("Sichen Trainer");
        UserAccount ua61 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer4", "trainer4", trainer4, new TrainerRole());
        
        Person trainer5 = trainerOrganization.getPersonDirectory().createPerson("Jill Trainer");
        UserAccount ua62 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer5", "trainer5", trainer5, new TrainerRole());
        
        ArrayList<OnlineSales> salesitemList = onlinesalesEnterprise.getOnlineSalesDirectory().getOnlineSalesList();
        
        readSalesItemList(salesitemList);
        
        Organization salesOrganization = onlinesalesEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.OnlineSales);
        Person sales1 = salesOrganization.getPersonDirectory().createPerson("Urban Sales");
        UserAccount ua7 = salesOrganization.getUserAccountDirectory().createUserAccount("sales1", "sales1", sales1, new OnlineSalesRole());
        
        Person sales2 = salesOrganization.getPersonDirectory().createPerson("Dorena Sales");
        UserAccount ua8 = salesOrganization.getUserAccountDirectory().createUserAccount("sales2", "sales2", sales2, new OnlineSalesRole());
        
        Person sales3 = salesOrganization.getPersonDirectory().createPerson("Geri Sales");
        UserAccount ua9 = salesOrganization.getUserAccountDirectory().createUserAccount("sales3", "sales3", sales3, new OnlineSalesRole());
        takeCourseRequest(fitEnterprise);
        readOnlineSalesRequest(fitEnterprise, onlinesalesEnterprise);
        readAppointmentRequest(fitEnterprise);
        
    
    }
    
    public static void takeCourse(ArrayList<Course> courseList){
        File f=new File("Course.csv");
        try {
            InputStreamReader customer = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(customer);
            String line = "";
            try {
                line = br.readLine(); //read header
                line = br.readLine();
                while (line != null) {
                    String[] courseData = line.split(",");
                    Course course = new Course(courseData[0], Integer.parseInt(courseData [1]), courseData [2]);
                    course.setRemainSeats(Integer.parseInt(courseData[1]));
                    courseList.add(course);
                    course.setDifficulties(courseData[2]);
                    line = br.readLine();
                }
            }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void takeCourseRequest(FitnessClubEnterprise fitEnterprise) {
       File f=new File("CourseRequest.csv");
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            try {
                line = br.readLine(); //read header
                line = br.readLine();
                while (line != null) {
                    String[] courseRequestData = line.split(",");
                    String courseName = courseRequestData[0];
                    Course c = null;
                    for(Course course : fitEnterprise.getCourseDirectory().getCourseList())
                        if(course.getCourseName().equals(courseName)){
                            c = course;
                            break;
                        }
                    CourseRequest courseRequest = new CourseRequest();
                    courseRequest.setCourse(c);

                    UserAccount cus = null;
                    for(Organization organization : fitEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(courseRequestData[1])){
                                cus = ua;
                                break;
                            }
                    
                    UserAccount manager = null;
                    for(Organization organization : fitEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(courseRequestData[2])){
                                manager = ua;
                                break;
                            }            
                    
                    //CourseRequest courseRequest = new CourseRequest();
                    courseRequest.setSender(cus);
                    courseRequest.setReceiver(manager);
                    courseRequest.setStatus(courseRequestData[3]);
                    
                    fitEnterprise.getCourseQueue().getCourseRequestList().add(courseRequest);
                    cus.getCourseQueue().getCourseRequestList().add(courseRequest);
                    line = br.readLine();
                }
            }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public static void readAppointmentRequest(FitnessClubEnterprise fitEnterprise) {
       File f = new File("AppointmentRequest.csv");
       try{
           InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
           BufferedReader br = new BufferedReader(reader);
           String line = "";
           try {
                line = br.readLine(); //read header
                line = br.readLine();
                while (line != null) {
                    String[] appointmentRequestData = line.split(",");
                    int roomNumber;
                    
                    ClassRoom cr = null;
                    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                    
                    Date date = null;
                    String session = appointmentRequestData[1]; //有问题
                    try {
                        date = df.parse(appointmentRequestData[2]);
                    } catch (ParseException ex) {
                        Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    UserAccount cus = null;
                    for(Organization organization : fitEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(appointmentRequestData[3])){
                                cus = ua;
                                break;
                            }
                    UserAccount trainer = null;
                    for(Organization organization : fitEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(appointmentRequestData[4])){
                                trainer = ua;
                                break;
                            }          
                    
                    Appointment appointment = new Appointment(date, session);
                    AppointmentRequest appointmentRequest = new AppointmentRequest(appointment);
                    appointmentRequest.setSender(cus);
                    if(!appointmentRequestData[0].equals("")){
                        roomNumber = Integer.parseInt(appointmentRequestData[0]);
                        for(ClassRoom classRoom : fitEnterprise.getClassRoomDirectory().getClassRoomList()){
                            if(classRoom.getNumber() == roomNumber){
                                cr = classRoom;
                                appointment.setClassRoom(cr);
                                break;
                            }
                        }
                    }
                    
                    appointmentRequest.setReceiver(trainer);
                    appointmentRequest.setStatus(appointmentRequestData[5]);
                    fitEnterprise.getAppointmentQueue().getAppointmentRequestList().add(appointmentRequest);
                    cus.getAppointmentQueue().getAppointmentRequestList().add(appointmentRequest);
                    
                    if(appointmentRequest.getStatus().equals("Cancelled"))
                        fitEnterprise.getAppointmentQueue().getAppointmentRequestList().remove(appointmentRequest);
                    
                    line = br.readLine();
                }
           }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
       }
    
        

    public static void readOnlineSalesRequest(FitnessClubEnterprise fitEnterprise, OnlineSalesEnterprise onlinesalesEnterprise) {
        File f=new File("OnlineSalesRequest.csv");
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            try {
                line = br.readLine(); //read header
                line = br.readLine();
                while (line != null) {
                    String[] itemRequestData = line.split(",");
                    String itemName = itemRequestData[0];
                    OnlineSales s = null;
                    for(OnlineSales onlinesales : onlinesalesEnterprise.getOnlineSalesDirectory().getOnlineSalesList())
                        if(onlinesales.getItemname().equals(itemName)){
                            s = onlinesales;
                            break;
                        }
                    HashMap<OnlineSales, Integer> cart = new HashMap();
                    cart.put(s, Integer.parseInt(itemRequestData[1]));
                    UserAccount cus = null;
                    for(Organization organization : fitEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(itemRequestData[2])){
                                cus = ua;
                                break;
                            }
                    
                    UserAccount salesManager= null;
                    for(Organization organization : onlinesalesEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(itemRequestData[3])){
                                salesManager = ua;
                                break;
                            }            
                    
                    OnlineSalesRequest onlinesalesRequest = new OnlineSalesRequest();
                    onlinesalesRequest.setSender(cus);
                    onlinesalesRequest.setItemOrder(cart);
                    onlinesalesRequest.setReceiver(salesManager);
                    onlinesalesRequest.setStatus(itemRequestData[4]);
                    onlinesalesEnterprise.getOnlineSalesQueue().getOnlinesalesRequestList().add(onlinesalesRequest);
                    cus.getOnlineSalesQueue().getOnlinesalesRequestList().add(onlinesalesRequest);
            
                    line = br.readLine();
                }
            }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void readSalesItemList(ArrayList<OnlineSales> salesitemList) {
        OnlineSales item1 = new OnlineSales("Protein powder", 50.0);
        OnlineSales item2 = new OnlineSales("Gatorate", 6);
        OnlineSales item3 = new OnlineSales("Red Bull", 3.5);
        OnlineSales item4 = new OnlineSales("Salad", 9);
        OnlineSales item5 = new OnlineSales("Fitness Ball", 17);
        OnlineSales item6 = new OnlineSales("Yoga Mat", 30.8);
        OnlineSales item7 = new OnlineSales("Weights", 15.8);
        OnlineSales item8 = new OnlineSales("Leggings", 50);
        OnlineSales item9 = new OnlineSales("Sports Bra", 27.2);
        OnlineSales item10 = new OnlineSales("Fitness Glove", 16.75);
        OnlineSales item11 = new OnlineSales("Loop Bands", 9.99);
        OnlineSales item12 = new OnlineSales("Fitness Bottle", 18);
        salesitemList.add(item1);
        salesitemList.add(item2);
        salesitemList.add(item3);
        salesitemList.add(item4);
        salesitemList.add(item5);
        salesitemList.add(item6);
        salesitemList.add(item7);
        salesitemList.add(item8);
        salesitemList.add(item9);
        salesitemList.add(item10);
        salesitemList.add(item11);
        salesitemList.add(item12);
    }
 
    
}



