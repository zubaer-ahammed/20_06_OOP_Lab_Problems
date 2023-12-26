package problem_07_inheritancegeneratepayslipforemployees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Employee {
    
    String emp_name, emp_id, address, mail_id, mobile_no, designation;
    double bp; //Basic Pay

    public Employee(String emp_name, String emp_id, String address, String mail_id, String mobile_no) {
        
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.address = address;
        this.mail_id = mail_id;
        this.mobile_no = mobile_no;
        
    }
    
    
    
    public void generatePaySlip() {
        
        double gross_salary = bp + (bp*0.97) + (bp*0.10) + (bp*0.12) + (bp*0.001);
        double net_salary = gross_salary - (bp*0.12) - (bp*0.001);
        
        System.out.println("------------ Employees Pay Slips ------------");    
        System.out.println("Emp_Name : "+ emp_name + "\t" + "Emp_id : "+ emp_id);         
        System.out.println("Address : " + address);         
        System.out.println("Mail_id : "+ mail_id + "\t" + "Mobile_no : " + mobile_no); 
        
        System.out.println("Designation: "+ designation);         
        System.out.println("Basic_Pay: "+ bp);        
        System.out.println("Gross Salary : "+ gross_salary + "\t" + "Net Salary : " + net_salary);  
        
        System.out.println("------------ End of the Statements -----------");  
        
        
    }
    
}

class Programmer extends Employee {

    double basic_pay;
    
    public Programmer(String emp_name, String emp_id, String address, String mail_id, String mobile_no, double basic_pay) {
        super(emp_name, emp_id, address, mail_id, mobile_no);
        this.basic_pay = basic_pay;
        bp = this.basic_pay;
    }
    
}

class AssistantProfessor extends Employee {

    double basic_pay;
    
    public AssistantProfessor(String emp_name, String emp_id, String address, String mail_id, String mobile_no, double basic_pay) {
        super(emp_name, emp_id, address, mail_id, mobile_no);
        this.basic_pay = basic_pay;
        bp = this.basic_pay;
    }
    
}

class AssociateProfessor extends Employee {

    double basic_pay;
    
    public AssociateProfessor(String emp_name, String emp_id, String address, String mail_id, String mobile_no, double basic_pay) {
        super(emp_name, emp_id, address, mail_id, mobile_no);
        this.basic_pay = basic_pay;
        bp = this.basic_pay;
    }
    
}

class Professor extends Employee {

    double basic_pay;
    
    public Professor(String emp_name, String emp_id, String address, String mail_id, String mobile_no, double basic_pay) {
        super(emp_name, emp_id, address, mail_id, mobile_no);
        this.basic_pay = basic_pay;
        bp = this.basic_pay;
    }
    
}

/**
 *
 * @author zubaer
 */
public class Problem_07_InheritanceGeneratePaySlipForEmployees {

    public static HashMap<String, String> enterEmployeeData() {
     
        HashMap<String, String> employeeData = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name: ");
        employeeData.put("emp_name", scanner.nextLine());
        System.out.print("Employee ID: ");
        employeeData.put("emp_id", scanner.nextLine());
        System.out.print("Address: ");
        employeeData.put("address", scanner.nextLine());
        System.out.print("Email: ");
        employeeData.put("mail_id", scanner.nextLine());
        System.out.print("Mobile No: ");
        employeeData.put("mobile_no", scanner.nextLine());        
        System.out.print("Basic Pay: ");
        employeeData.put("basic_pay", scanner.nextLine());  
        
        return employeeData;
        
    }
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int option, choice;
        HashMap<String, String> employeeData;
        Scanner scanner = new Scanner(System.in);

        do {
            
            System.out.print("\nDo you want to create an Employee (0 for no, 1 for yes): ");
            choice = scanner.nextInt();
            
            employeeData = enterEmployeeData();
            
            String emp_name = employeeData.get("emp_name");
            String emp_id = employeeData.get("emp_id");
            String address = employeeData.get("address");
            String mail_id = employeeData.get("mail_id");
            String mobile_no = employeeData.get("mobile_no");
            Double basic_pay = Double.valueOf(employeeData.get("basic_pay"));
            
            System.out.println("\nSelect Employee Designation: ");
            System.out.println("1. Programmer\n2. Assistant Professor\n3. Associate Professor\n4. Professor");
            System.out.print("\nChoice: ");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    
                    employeeData.put("designation", "Programmer");
                    
                    Programmer programmer = new Programmer(emp_name, emp_id, address, mail_id, mobile_no, basic_pay);
                    programmer.generatePaySlip();
                    break;
                    
                case 2:
                    
                    employeeData.put("designation", "Assistant Professor");                    
                    
                    AssistantProfessor assistantProfessor = new AssistantProfessor(emp_name, emp_id, address, mail_id, mobile_no, basic_pay);
                    assistantProfessor.generatePaySlip();
                    break;
                    
                case 3:
                    
                    employeeData.put("designation", "Associate Professor");                    
                    
                    AssociateProfessor associateProfessor = new AssociateProfessor(emp_name, emp_id, address, mail_id, mobile_no, basic_pay);
                    associateProfessor.generatePaySlip();
                    break;                    
                    
                case 4:

                    employeeData.put("designation", "Professor");                    
                    
                    Professor professor = new Professor(emp_name, emp_id, address, mail_id, mobile_no, basic_pay);
                    professor.generatePaySlip();
                    break;                    
                    
                default:
                    System.out.println("Invalid choice.");
            }
            
            
        } while(choice != 0);
        

        
    }
    
}
