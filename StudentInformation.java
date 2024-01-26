/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author reyeskl
 */
public class StudentInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("==========STUDENT INFORMATION ==========");
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Student Lastname: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Student Firstname: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Student Middlename: ");
        String middleName = scanner.nextLine();
        System.out.print("Enter Student Program: ");
        String program = scanner.nextLine();
        System.out.print("Enter Student Year Level: ");
        String yearLevel = scanner.nextLine();
        System.out.print("\nEnter Student Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Student Email Address: ");
        String emailAddress = scanner.nextLine();
        System.out.print("Enter Student Birthday: ");
        String birthday = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("\nEnter Student Midterm grade: ");
        double midterm = scanner.nextDouble();
        System.out.print("Enter Student Final grade: ");
        double fgrade = scanner.nextDouble();
        
       
        System.out.println("\n=================STUDENT INFORMATION OUTPUT=================");
        System.out.print("\nProgram: "+program);
        System.out.println("\t\t\t\tYear Level: "+program);
        System.out.print("Firstname:"+firstName);
        System.out.print("\tMiddlename:"+middleName);
        System.out.println("\tLastname:"+lastName);
        System.out.println("Address: "+address);
        System.out.print("Birthday: "+birthday);
        System.out.println("\t\t\tAge: "+age);
        System.out.println("Email address: "+emailAddress);
        System.out.println("\n=====================STUDENT GRADE OUTPUT===================");
        System.out.print("\t\t\nMidterm grade: "+midterm);
        System.out.println("\t\t\tFinal grade: "+fgrade);
        
    }
    
}
