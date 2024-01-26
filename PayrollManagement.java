/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author reyeskl
 */
public class PayrollManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        String[] employeeFirstName = new String[5];
        String[] employeeLastName = new String[5];
        String[] position = new String[5];
        String[] department = new String[5];
        int[] days = new int[5];
        int[] overtimeHour = new int[5];
        int[] sss = new int[5];
        int[] pagIbig = new int[5];
        int[] philHealth = new int[5];
        int overtimePay;
        final int supervisor = 2000;
        final int manager = 1500;
        final int associate = 1000;
        final int staff = 500;
        final int other = 300;
        int basicPay = 0;
        int deduction = 0;
        
        //looping for choice
        while(choose != 3){
        System.out.println("===========MENU===========");
        System.out.println("1: Enter Employee Payroll");
        System.out.println("2: Display Employee Payroll");
        System.out.println("3: Quit");
        System.out.println("==========================");
        System.out.print("Choose...: ");
        choose = scanner.nextInt();
        scanner.nextLine();
 
        switch(choose)
        {
            case 1:
                System.out.println(" ");
                for(int i = 0; i < employeeFirstName.length; i++)
                {
                    //getting employee informations 
                    System.out.print("\nEnter employee first name: ");
                    employeeFirstName[i] = scanner.nextLine();
                    System.out.print("Enter employee last name: ");
                    employeeLastName[i] = scanner.nextLine();
                    System.out.print("Enter department of " + employeeLastName[i] + ": ");
                    department[i] = scanner.nextLine();
                    System.out.print("Enter employee position of " + employeeLastName[i] + ": ");
                    position[i] = scanner.nextLine();
                    
                    if(position[i].equalsIgnoreCase("Supervisor")){
                        System.out.println("The daily rate of " + employeeLastName[i] + ": " + supervisor);
                    }else if(position[i].equalsIgnoreCase("Manager")){
                        System.out.println("The daily rate of " + employeeLastName[i] + ": " + manager);
                    }else if(position[i].equalsIgnoreCase("Associate")){
                        System.out.println("The daily rate of " + employeeLastName[i] + ": " + associate);
                    }else if(position[i].equalsIgnoreCase("Staff")){
                        System.out.println("The daily rate of " + employeeLastName[i] + ": " + staff);
                    }else{
                        System.out.println("The daily rate of " + employeeLastName[i] + ": " + other);
                    }
                    
                    System.out.print("Enter days worked of " + employeeLastName[i] + ": ");
                    days[i] = scanner.nextInt();
                    System.out.print("Enter overtime hour of " + employeeLastName[i] + ": ");
                    overtimeHour[i] = scanner.nextInt();
                    scanner.nextLine();
                    if(overtimeHour[i] == 0){
                        overtimePay = 0;
                        System.out.println("Overtime pay of "+ employeeLastName[i] + ": " + overtimePay);
                    }else if(overtimeHour[i] <= 3){
                        overtimePay = 500;
                        System.out.println("Overtime pay of " + employeeLastName[i] + ": "+ overtimePay);
                    }else if(overtimeHour[i] <= 6){
                        overtimePay = 800;
                        System.out.println("Overtime pay of " + employeeLastName[i] + ": "  + overtimePay);
                    }else{
                        overtimePay = 1000;
                        System.out.println("Overtime pay of " + employeeLastName[i] + ": "  + overtimePay);
                    }
                    
                    System.out.print("Enter SSS contribution of " + employeeLastName[i] + ": ");
                    sss[i] = scanner.nextInt();
                    System.out.print("Enter Pag-ibig contribution of " + employeeLastName[i] + ": ");
                    pagIbig[i] = scanner.nextInt();
                    System.out.print("Enter PhilHealth contribution of " + employeeLastName[i] + ": ");
                    philHealth[i] = scanner.nextInt();
                    scanner.nextLine();
                    
                }
                break;
            case 2:
                for(int j = 0; j < employeeFirstName.length; j++)
                {
                    //printing employee informations
                    System.out.println("\n========EMPLOYEE PAYSLIP=========");
                    System.out.println("Employee Name: " + employeeFirstName[j]);
                    System.out.println("Employee Position: " + position[j]);
                    System.out.println("Employee department: " + department[j]);
                    System.out.println("===========BASIC SALARY==========");
                    
                    if(position[j].equalsIgnoreCase("Supervisor")){
                        System.out.println("Daily rate: " + supervisor);
                    }else if(position[j].equalsIgnoreCase("manager")){
                        System.out.println("Daily rate: " + manager);
                    }else if(position[j].equalsIgnoreCase("Assosiate")){
                        System.out.println("Daily rate: " + associate);
                    }else if(position[j].equalsIgnoreCase("Staff")){
                        System.out.println("Daily rate: " + staff);
                    }else{
                        System.out.println("Daily rate: " + other);
                    }
                    
                    System.out.println("Days worked: " + days[j]);
                    
                    if(overtimeHour[j] == 0){
                        overtimePay = 0;
                        System.out.println("Overtime pay: " + overtimePay);
                    }else if(overtimeHour[j] <= 3){
                        overtimePay = 500;
                        System.out.println("Overtime pay: " + overtimePay);
                    }else if(overtimeHour[j] <= 6){
                        overtimePay = 800;
                        System.out.println("Overtime pay: " + overtimePay);
                    }else{
                        overtimePay = 1000;
                        System.out.println("Overtime pay: " + overtimePay);
                    }
                    
                    if(position[j].equalsIgnoreCase("Supervisor")){
                        basicPay = (supervisor * days[j]) + overtimePay;
                    }else if(position[j].equalsIgnoreCase("manager")){
                        basicPay = (manager * days[j]) + overtimePay;
                    }else if(position[j].equalsIgnoreCase("Assosiate")){
                        basicPay = (associate * days[j]) + overtimePay;
                    }else if(position[j].equalsIgnoreCase("Staff")){
                        basicPay = (staff * days[j]) + overtimePay;
                    }else{
                        basicPay = (other * days[j]) + overtimePay;
                    }
                    
                    System.out.println("Basic pay: " + basicPay);
                    
                    System.out.println("=============DEDUCTION============");
                    System.out.println("SSS Contribution: " + sss[j]);
                    System.out.println("Pag-ibig Contribution: " + pagIbig[j]);
                    System.out.println("Philhealth Contribution: " + philHealth[j]);
                    
                    deduction = sss[j] + pagIbig[j] + philHealth[j];
                    
                    System.out.println("Total deduction: " + deduction);
                    System.out.println("=========NET PAY=====================");
                    System.out.println("Net pay: " + (basicPay - deduction));
                }
                break;
            case 3: 
                //to stop the program
                System.exit(0);
                break;
                
            default:
                System.out.println("Invalid Input");
        }
        
        }
    } 
}
