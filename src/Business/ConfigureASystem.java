package Business;

import Business.Booking.Booking;
import Business.Booking.Room;
import Business.Program.Program;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Enterprise.GymEnterprise;
import Business.Enterprise.SalesEnterprise;
import Business.Network.Network;
import Business.Organization.TrainerOrganization;
import Business.Organization.CustomerOrganization;
import Business.Organization.ClerkOrganization;
import Business.Organization.Organization;
//import static Business.Organization.Organization.Type.Sales;
import static Business.Organization.Organization.Type.Sales;
import Business.Organization.SalesOrganization;
import Business.Role.Role;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.SalesRole;
import Business.Role.TrainerRole;
import Business.Role.ClerkRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentRequest;
import Business.WorkQueue.ProgramRequest;
import Business.WorkQueue.ProgramReviewRequest;
import Business.Person.Customer;
import Business.Person.Person;
import Business.Role.AnalystRole;
import Business.Sales.Sales;
import Business.Role.GymManagerRole;
import Business.Role.SalesManagerRole;
import Business.WorkQueue.SalesRequest;
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
        
//        Network network = new Network();  
//        network.setName("FitnessClub");
//        system.getNetworkList().add(network);
//        
//        GymEnterprise fitEnterprise = (GymEnterprise) network.getEnterpriseDirectory().createAndAddEnterprise("FitEnterprise", Enterprise.EnterpriseType.FitnessClub);
//        Person admin1 = fitEnterprise.getPersonDirectory().createPerson("fitadmin");
//        fitEnterprise.getUserAccountDirectory().createUserAccount("fitadmin", "fitadmin", admin1, new AdminRole());
//        
//        Organization cusOrganization = fitEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
//        Person cus1 = cusOrganization.getPersonDirectory().createPerson("Lily cus");
//        UserAccount ua1 = cusOrganization.getUserAccountDirectory().createUserAccount("cus1", "cus1", cus1, new CustomerRole());
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        //System Manager
//        Employee employee1 = system.getEmployeeDirectory().createEmployee("sys", "8123609225","luliu@neu.edu");
//        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("sys1", "sys1", person1, new SystemAdminRole());
        
        testData(system);
        return system;
    }
    
    public static void testData(EcoSystem system){
        Network network = new Network();  
        //network.setName("FitnessClub");
        network.setName("GymNetwork");
        
        system.getNetworkList().add(network);
        
        //FitnessClub Admin
        //GymEnterprise fitEnterprise = (GymEnterprise) network.getEnterpriseDirectory().createAndAddEnterprise("FitEnterprise", Enterprise.EnterpriseType.FitnessClub);
        GymEnterprise gymEnterprise = (GymEnterprise) network.getEnterpriseDirectory().createAndAddEnterprise("GymEnterprise", Enterprise.EnterpriseType.Gym);
//        Person admin1 = fitEnterprise.getPersonDirectory().createPerson("fitadmin");
//        fitEnterprise.getUserAccountDirectory().createUserAccount("fitadmin", "fitadmin", admin1, new GymManagerRole());
//        
        SalesEnterprise salesEnterprise = (SalesEnterprise) network.getEnterpriseDirectory().createAndAddEnterprise("Sales", Enterprise.EnterpriseType.Sales);
//        Person admin2 = onlinesalesEnterprise.getPersonDirectory().createPerson("salesadmin");
//        onlinesalesEnterprise.getUserAccountDirectory().createUserAccount("salesadmin", "salesadmin", admin2, new SalesRole());
        
        ArrayList<Program> courseList = gymEnterprise.getProgramDirectory().getProgramList();
        takeCourse(courseList);//zhushihuilai
        
        Organization fitOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.GymManager);
        Person fitnessclubManager1 = fitOrganization.getPersonDirectory().createPerson("Jessy Manager");
        UserAccount ua11 = fitOrganization.getUserAccountDirectory().createUserAccount("manager1", "manager1", fitnessclubManager1, new GymManagerRole());
        
        Person fitnessclubManager2 = fitOrganization.getPersonDirectory().createPerson("James Manager");
        UserAccount ua12 = fitOrganization.getUserAccountDirectory().createUserAccount("manager2", "manager2", fitnessclubManager2, new GymManagerRole());
        
        Organization anaOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Analysis);
        Person gymAnalyst = fitOrganization.getPersonDirectory().createPerson("Williams Richard");
        UserAccount ua66 = fitOrganization.getUserAccountDirectory().createUserAccount("ana1", "ana1", gymAnalyst, new AnalystRole());
//        Person fitnessclubManager2 = fitOrganization.getPersonDirectory().createPerson("Tom Manager");
//        UserAccount ua12 = fitOrganization.getUserAccountDirectory().createUserAccount("manager2", "manager2", fitnessclubManager2, new GymManagerRole());
//        
//        Person fitnessclubManager3 = fitOrganization.getPersonDirectory().createPerson("Annie Manager");
//        UserAccount ua13 = fitOrganization.getUserAccountDirectory().createUserAccount("manager3", "manager3", fitnessclubManager3, new GymManagerRole());
        
        Organization cusOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
        Person cus1 = cusOrganization.getPersonDirectory().createPerson("Jack Customer");
        UserAccount ua1 = cusOrganization.getUserAccountDirectory().createUserAccount("cust1", "cust1", cus1, new CustomerRole());
        
        Person cus2 = cusOrganization.getPersonDirectory().createPerson("Martha Customer");
        UserAccount ua2 = cusOrganization.getUserAccountDirectory().createUserAccount("cust2", "cust2", cus2, new CustomerRole());
        
        Person cus3 = cusOrganization.getPersonDirectory().createPerson("Bob Customer");
        UserAccount ua3 = cusOrganization.getUserAccountDirectory().createUserAccount("cust3", "cust3", cus3, new CustomerRole());
        
        Person cus4 = cusOrganization.getPersonDirectory().createPerson("Bill Customer");
        UserAccount ua33 = cusOrganization.getUserAccountDirectory().createUserAccount("cust4", "cust4", cus4, new CustomerRole());
  
        
        Organization trainerOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Trainer);
        Person trainer1 = trainerOrganization.getPersonDirectory().createPerson("Jessica Trainer");
        UserAccount ua4 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer1", "trainer1", trainer1, new TrainerRole());
        
        Person trainer2 = trainerOrganization.getPersonDirectory().createPerson("Will Trainer");
        UserAccount ua5 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer2", "trainer2", trainer2, new TrainerRole());
        
        Person trainer3 = trainerOrganization.getPersonDirectory().createPerson("Dalton Trainer");
        UserAccount ua6 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer3", "trainer3", trainer3, new TrainerRole());
        
        Person trainer4 = trainerOrganization.getPersonDirectory().createPerson("Jill Trainer");
        UserAccount ua61 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer4", "trainer4", trainer4, new TrainerRole());

        
        ArrayList<Sales> salesitemList = salesEnterprise.getOnlineSalesDirectory().getSalesList();
        
        readSalesProductList(salesitemList);
        
        Organization salesOrganization = salesEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Sales);
        
        
        Person sales1 = salesOrganization.getPersonDirectory().createPerson("Sales Unit 1");
        UserAccount ua7 = salesOrganization.getUserAccountDirectory().createUserAccount("sales1", "sales1", sales1, new SalesRole());
        
        Person sales2 = salesOrganization.getPersonDirectory().createPerson("Sales Unit 2");
        UserAccount ua8 = salesOrganization.getUserAccountDirectory().createUserAccount("sales2", "sales2", sales2, new SalesRole());
        
        Person sales3 = salesOrganization.getPersonDirectory().createPerson("Sales Unit 3");
        UserAccount ua9 = salesOrganization.getUserAccountDirectory().createUserAccount("sales3", "sales3", sales3, new SalesRole());
        
        Person salesmanager = salesOrganization.getPersonDirectory().createPerson("Kevin Manager");
        UserAccount ua10 = salesOrganization.getUserAccountDirectory().createUserAccount("salesmanager", "salesmanager", salesmanager, new SalesManagerRole());
        
//        Organization clerkOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Clerk);
//        Person clerk1 = clerkOrganization.getPersonDirectory().createPerson("Johnny Clerk");
//        UserAccount ua23 = clerkOrganization.getUserAccountDirectory().createUserAccount("clerk1", "clerk1", clerk1, new ClerkRole());
        
        takeCourseRequest(gymEnterprise);
        readOnlineSalesRequest(gymEnterprise, salesEnterprise);
        readAppointmentRequest(gymEnterprise);
    }
    
    public static void takeCourse(ArrayList<Program> courseList){
        File f = new File("Program.csv");
        try {
            InputStreamReader customer = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(customer);
            String line = "";
            try {
                line = br.readLine(); //read header
                line = br.readLine();
                while (line != null) {
                    //String[] courseData = line.split(",");
                    String[] programData = line.split(",");
                    Program program = new Program(programData[0], Integer.parseInt(programData [1]), programData [2]);
                    program.setRemainSeats(Integer.parseInt(programData[1]));
                    courseList.add(program);
                    program.setDifficulties(programData[2]);
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
    
    
    public static void takeCourseRequest(GymEnterprise fitEnterprise) {
       File f = new File("ProgramRequest.csv");
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            try {
                line = br.readLine(); //read header
                line = br.readLine();
                while (line != null) {
                    //String[] courseRequestData = line.split(",");
                    String[] programRequestData = line.split(",");
                    //String courseName = courseRequestData[0];
                    String programName = programRequestData[0];
                    Program p = null;
                    for(Program program : fitEnterprise.getProgramDirectory().getProgramList())
                        if(program.getProgramName().equals(programName)){
                            p = program;
                            break;
                        }
                    ProgramRequest programRequest = new ProgramRequest();
                    programRequest.setProgram(p);
//                    ArrayList<Course> courseList = new ArrayList();
//                    courseList.add(c);
                    UserAccount cus = null;
                    for(Organization organization : fitEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(programRequestData[1])){
                                cus = ua;
                                break;
                            }
                    
                    UserAccount manager = null;
                    for(Organization organization : fitEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(programRequestData[2])){
                                manager = ua;
                                break;
                            }            
                    
                    //CourseRequest courseRequest = new ProgramRequest();
                    programRequest.setSender(cus);
                    programRequest.setReceiver(manager);
                    programRequest.setStatus(programRequestData[3]);
                    
                    fitEnterprise.getProgramQueue().getProgramRequestList().add(programRequest);
                    cus.getProgramQueue().getProgramRequestList().add(programRequest);
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
    

    public static void readAppointmentRequest(GymEnterprise fitEnterprise) {
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
                    
                    Room cr = null;
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
                    
                    Booking appointment = new Booking(date, session);
                    AppointmentRequest appointmentRequest = new AppointmentRequest(appointment);
                    appointmentRequest.setSender(cus);
                    if(!appointmentRequestData[0].equals("")){
                        roomNumber = Integer.parseInt(appointmentRequestData[0]);
                        for(Room classRoom : fitEnterprise.getClassRoomDirectory().getClassRoomList()){
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
    
        

    public static void readOnlineSalesRequest(GymEnterprise fitEnterprise, SalesEnterprise onlinesalesEnterprise) {
        
        File f = new File("Product_sales.csv");
        
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            try {
                line = br.readLine(); //read header
                line = br.readLine();
                while (line != null) {
                    String[] productRequestData = line.split(",");
                    String productName = productRequestData[0];
                    Sales s = null;
                    for(Sales onlinesales : onlinesalesEnterprise.getOnlineSalesDirectory().getSalesList())
                        if(onlinesales.getProductName().equals(productName)){
                            s = onlinesales;
                            break;
                        }
                    HashMap<Sales, Integer> cart = new HashMap();
                    cart.put(s, Integer.parseInt(productRequestData[1]));
                    UserAccount cus = null;
                    for(Organization organization : fitEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(productRequestData[2])){
                                cus = ua;
                                break;
                            }
                    
                    UserAccount salesManager= null;
                    for(Organization organization : onlinesalesEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(productRequestData[3])){
                                salesManager = ua;
                                break;
                            }            
                    
                    SalesRequest onlinesalesRequest = new SalesRequest();
                    onlinesalesRequest.setSender(cus);
                    onlinesalesRequest.setProductOrder(cart);
                    onlinesalesRequest.setReceiver(salesManager);
                    onlinesalesRequest.setStatus(productRequestData[4]);
                    onlinesalesEnterprise.getOnlineSalesQueue().getOnlinesalesRequestList().add(onlinesalesRequest);
                    cus.getSalesQueue().getOnlinesalesRequestList().add(onlinesalesRequest);
            
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

    public static void readSalesProductList(ArrayList<Sales> salesitemList) {

        Sales item_no1 = new Sales("Energy Drink", 45.5);
        Sales item_no2 = new Sales("Protein Bar", 10);
        Sales item_no3 = new Sales("Protein Shake", 30);
        Sales item_no4 = new Sales("Veggies", 15);
        Sales item_no5 = new Sales("Mass Gainer", 35.5);
        Sales item_no6 = new Sales("Gym Shoes", 100);
        Sales item_no7 = new Sales("Gym Wear", 150);
        Sales item_no8 = new Sales("BCAA", 25.5);
        Sales item_no9 = new Sales("Pre Workout Drink", 43.3);
        Sales item_no10 = new Sales("Stretching Mat", 51.75);

        salesitemList.add(item_no1);
        salesitemList.add(item_no2);
        salesitemList.add(item_no3);
        salesitemList.add(item_no4);
        salesitemList.add(item_no5);
        salesitemList.add(item_no6);
        salesitemList.add(item_no7);
        salesitemList.add(item_no8);
        salesitemList.add(item_no9);
        salesitemList.add(item_no10);
    }  
}
