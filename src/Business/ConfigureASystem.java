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
        
        testData(system);
        return system;
    }
    
    public static void testData(EcoSystem system){
        Network network = new Network();  
        
        network.setName("GymNetwork");
        
        system.getNetworkList().add(network);
        
        
        GymEnterprise gymEnterprise = (GymEnterprise) network.getEnterpriseDirectory().createAndAddEnterprise("GymEnterprise", Enterprise.EnterpriseType.Gym);
      
        SalesEnterprise salesEnterprise = (SalesEnterprise) network.getEnterpriseDirectory().createAndAddEnterprise("Sales", Enterprise.EnterpriseType.Sales);
      
        
        ArrayList<Program> courseList = gymEnterprise.getProgramDirectory().getProgramList();
        takeProgram(courseList);
        
        Organization gymOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.GymManager);
        Person gymManager1 = gymOrganization.getPersonDirectory().createPerson("Jessy Manager");
        UserAccount acc1 = gymOrganization.getUserAccountDirectory().createUserAccount("manager1", "manager1", gymManager1, new GymManagerRole());
        
        Person gymManager2 = gymOrganization.getPersonDirectory().createPerson("James Manager");
        UserAccount acc2 = gymOrganization.getUserAccountDirectory().createUserAccount("manager2", "manager2", gymManager2, new GymManagerRole());
        
        
        
        Organization analystOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Analysis);
        Person gymAnalyst = gymOrganization.getPersonDirectory().createPerson("Williams Richard");
        UserAccount acc3 = gymOrganization.getUserAccountDirectory().createUserAccount("ana1", "ana1", gymAnalyst, new AnalystRole());
    
        
        Organization cusOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
        Person cus1 = cusOrganization.getPersonDirectory().createPerson("Louis Customer");
        UserAccount acc4 = cusOrganization.getUserAccountDirectory().createUserAccount("cus1", "cus1", cus1, new CustomerRole());
        
        Person cus2 = cusOrganization.getPersonDirectory().createPerson("Martha Customer");
        UserAccount acc5 = cusOrganization.getUserAccountDirectory().createUserAccount("cus2", "cus2", cus2, new CustomerRole());
        
        Person cus3 = cusOrganization.getPersonDirectory().createPerson("Steven Customer");
        UserAccount acc6 = cusOrganization.getUserAccountDirectory().createUserAccount("cus3", "cus3", cus3, new CustomerRole());
        
        Person cus4 = cusOrganization.getPersonDirectory().createPerson("Charlie Customer");
        UserAccount acc7 = cusOrganization.getUserAccountDirectory().createUserAccount("cus4", "cus4", cus4, new CustomerRole());
        
        Person cus5 = cusOrganization.getPersonDirectory().createPerson("Shauna Customer");
        UserAccount acc8 = cusOrganization.getUserAccountDirectory().createUserAccount("cus5", "cus5", cus5, new CustomerRole());
        
        Person cus6 = cusOrganization.getPersonDirectory().createPerson("Ross Customer");
        UserAccount acc9 = cusOrganization.getUserAccountDirectory().createUserAccount("cus6", "cus6", cus6, new CustomerRole());
        
        Person cus7 = cusOrganization.getPersonDirectory().createPerson("Harry Customer");
        cusOrganization.getUserAccountDirectory().createUserAccount("cus7", "cus7", cus7, new CustomerRole());
        
        Organization trainerOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Trainer);
        Person trainer1 = trainerOrganization.getPersonDirectory().createPerson("Fiona Trainer");
        UserAccount acc10 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer1", "trainer1", trainer1, new TrainerRole());
        
        Person trainer2 = trainerOrganization.getPersonDirectory().createPerson("Roland Trainer");
        UserAccount acc11 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer2", "trainer2", trainer2, new TrainerRole());
        
        Person trainer3 = trainerOrganization.getPersonDirectory().createPerson("Martin Trainer");
        UserAccount acc12 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer3", "trainer3", trainer3, new TrainerRole());
        
        Person trainer4 = trainerOrganization.getPersonDirectory().createPerson("Owen Trainer");
        UserAccount acc13 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer4", "trainer4", trainer4, new TrainerRole());
        
        Person trainer5 = trainerOrganization.getPersonDirectory().createPerson("Fred Trainer");
        UserAccount acc14 = trainerOrganization.getUserAccountDirectory().createUserAccount("trainer5", "trainer5", trainer5, new TrainerRole());
        
        ArrayList<Sales> salesitemList = salesEnterprise.getOnlineSalesDirectory().getSalesList();
        
        readSalesProductList(salesitemList);
        
        Organization salesOrganization = salesEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Sales);
        
        
        Person sales1 = salesOrganization.getPersonDirectory().createPerson("Sales Unit 1");
        UserAccount acc15 = salesOrganization.getUserAccountDirectory().createUserAccount("sales1", "sales1", sales1, new SalesRole());
        
        Person sales2 = salesOrganization.getPersonDirectory().createPerson("Sales Unit 2");
        UserAccount acc16 = salesOrganization.getUserAccountDirectory().createUserAccount("sales2", "sales2", sales2, new SalesRole());
        
        Person sales3 = salesOrganization.getPersonDirectory().createPerson("Sales Unit 3");
        UserAccount acc17 = salesOrganization.getUserAccountDirectory().createUserAccount("sales3", "sales3", sales3, new SalesRole());
        
        Person salesmanager = salesOrganization.getPersonDirectory().createPerson("Kevin Manager");
        UserAccount acc18 = salesOrganization.getUserAccountDirectory().createUserAccount("salesmanager", "salesmanager", salesmanager, new SalesManagerRole());
        
//        Organization clerkOrganization = gymEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Clerk);
//        Person clerk1 = clerkOrganization.getPersonDirectory().createPerson("Johnny Clerk");
//        UserAccount acc19 = clerkOrganization.getUserAccountDirectory().createUserAccount("clerk1", "clerk1", clerk1, new ClerkRole());
        
        takeProgramRequest(gymEnterprise);
        readSalesRequest(gymEnterprise, salesEnterprise);
        readAppointmentRequest(gymEnterprise);
    }
    
    public static void takeProgram(ArrayList<Program> courseList){
        File f = new File("Program.csv");
        try {
            InputStreamReader customer = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(customer);
            String l = "";
            try {
                l = br.readLine(); //read header
                l = br.readLine();
                while (l != null) {
                    
                    
                    String[] programData = l.split(",");
                    Program program = new Program(programData[0], Integer.parseInt(programData [1]), programData [2]);
                    program.setRemainSeats(Integer.parseInt(programData[1]));
                    courseList.add(program);
                    program.setDifficulties(programData[2]);
                    l = br.readLine();
                }
            }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void takeProgramRequest(GymEnterprise gymEnterprise) {
       File f = new File("ProgramRequest.csv");
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(reader);
            String l = "";
            try {
                l = br.readLine(); //read header
                l = br.readLine();
                while (l != null) {
                    
                    String[] programRequestData = l.split(",");
                    
                    String programName = programRequestData[0];
                    Program p = null;
                    for(Program program : gymEnterprise.getProgramDirectory().getProgramList())
                        if(program.getProgramName().equals(programName)){
                            p = program;
                            break;
                        }
                    ProgramRequest programRequest = new ProgramRequest();
                    programRequest.setProgram(p);

                    UserAccount cus = null;
                    for(Organization organization : gymEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(programRequestData[1])){
                                cus = ua;
                                break;
                            }
                    
                    UserAccount manager = null;
                    for(Organization organization : gymEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(programRequestData[2])){
                                manager = ua;
                                break;
                            }            
                    
                    
                    
                    
                    
                    programRequest.setSender(cus);
                    programRequest.setReceiver(manager);
                    programRequest.setStatus(programRequestData[3]);
                    
//                    programRequest.setSender2(cus);
//                    programRequest.setReceiver2(manager);
                    
                    gymEnterprise.getProgramQueue().getProgramRequestList().add(programRequest);
                    cus.getProgramQueue().getProgramRequestList().add(programRequest);
                    l = br.readLine();
                }
            }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public static void readAppointmentRequest(GymEnterprise gymEnterprise) {
       File f = new File("AppointmentRequest.csv");
       try{
           InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
           BufferedReader br = new BufferedReader(reader);
           String l = "";
           try {
                l = br.readLine(); //read header
                l = br.readLine();
                
                while (l != null) {
                    String[] appointmentRequestData = l.split(",");
                    int roomNumber;
                    
                    Room room = null;
                    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                    
                    Date date = null;
                    String session = appointmentRequestData[1];
                    
                    try {
                        date = df.parse(appointmentRequestData[2]);
                    } catch (ParseException ex) {
                        Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    UserAccount cus = null;
                    for(Organization organization : gymEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(appointmentRequestData[3])){
                                cus = ua;
                                break;
                            }
                    UserAccount trainer = null;
                    for(Organization organization : gymEnterprise.getOrganizationDirectory().getOrganizationList())
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
                        for(Room room2 : gymEnterprise.getClassRoomDirectory().getClassRoomList()){
                            if(room2.getNumber() == roomNumber){
                                room = room2;
                                appointment.setClassRoom(room);
                                break;
                            }
                        }
                    }
                    
                    appointmentRequest.setReceiver(trainer);
                    appointmentRequest.setStatus(appointmentRequestData[5]);
                    gymEnterprise.getAppointmentQueue().getAppointmentRequestList().add(appointmentRequest);
                    cus.getAppointmentQueue().getAppointmentRequestList().add(appointmentRequest);
                    
                    if(appointmentRequest.getStatus().equals("Cancelled"))
                        gymEnterprise.getAppointmentQueue().getAppointmentRequestList().remove(appointmentRequest);
                    
                    l = br.readLine();
                }
           }catch (IOException ex) {
                Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureASystem.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
       }
    
        

    public static void readSalesRequest(GymEnterprise gymEnterprise, SalesEnterprise salesEnterprise) {
        
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
                    for(Sales onlinesales : salesEnterprise.getOnlineSalesDirectory().getSalesList())
                        if(onlinesales.getProductName().equals(productName)){
                            s = onlinesales;
                            break;
                        }
                    HashMap<Sales, Integer> cart = new HashMap();
                    cart.put(s, Integer.parseInt(productRequestData[1]));
                    UserAccount cus = null;
                    for(Organization organization : gymEnterprise.getOrganizationDirectory().getOrganizationList())
                        for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                            if(ua.getUsername().equals(productRequestData[2])){
                                cus = ua;
                                break;
                            }
                    
                    UserAccount salesManager= null;
                    for(Organization organization : salesEnterprise.getOrganizationDirectory().getOrganizationList())
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
                    salesEnterprise.getOnlineSalesQueue().getOnlinesalesRequestList().add(onlinesalesRequest);
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
