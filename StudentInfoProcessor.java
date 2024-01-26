/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;

public class StudentInfoProcessor {
    
    public static void main(String[] args) {
        System.out.println("************STUDENT INFORMATION SHEET************");
        System.out.println("*************************************************");
       
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Enter your First name: ");
        String firstName = scanner.nextLine();
        
        System.out.println("Enter your Middle name: ");
        char middleName=scanner.nextLine().charAt(0);
        
        System.out.println("Enter your Last name: ");
        String lastName = scanner.nextLine();
        
        System.out.println("Enter your Birthdate: ");
        String birthDate = scanner.nextLine();
        
        System.out.println("Enter your Birthplace: ");
         String birthPlace = scanner.nextLine();
        
        System.out.println("Enter your Email address: ");
        String email = scanner.nextLine();
        
        System.out.println("Enter your Department: ");
        String department = scanner.nextLine();
        
        System.out.println("Enter your Program: ");
        String program = scanner.nextLine();
        
        System.out.println("Enter your Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter your major: ");
        String major = scanner.nextLine();
        
        System.out.println("\nEnter your First name: "+firstName);
        System.out.println("Enter your Middle name: "+middleName);
        System.out.println("Enter your Last name: "+lastName);
        System.out.println("Enter your Birthdate: "+birthDate);
        System.out.println("Enter your Birthplace: "+birthPlace);
        System.out.println("Enter your Email address: "+email);
        System.out.println("Enter your Department: "+department);
        System.out.println("Enter your Program: "+program);
        System.out.println("Enter your Year: "+year);
        System.out.println("Enter your major: "+major);
        
        
    }
    
}
