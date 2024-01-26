/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("==============STUDENT INFORMATION==============");
        System.out.print("Enter Student Name:");
        String sn = scanner.nextLine();
        System.out.print("Enter Student Course:");
        String sc = scanner.nextLine();
        System.out.println("===============GRADE COMPUTATION===============");
        
        System.out.println("\n===Mid Term====");
        System.out.print("Enter Assestment 1: ");
        double ma1 = scanner.nextDouble();
        System.out.print("Enter Assestment 2: ");
        double ma2 = scanner.nextDouble();
        System.out.print("Enter Assestment 3: ");
        double ma3 = scanner.nextDouble();
        System.out.print("Enter Class Standing: ");
        double cs = scanner.nextDouble();
        System.out.print("Enter Interim1 Grade: ");
        double ig = scanner.nextDouble();
        System.out.print("Enter Midterm Major Exam Grade: ");
        double mm1 = scanner.nextDouble();
        
        System.out.println("\n===Final term====");
        System.out.print("Enter Assestment 1: ");
        double fa1 = scanner.nextDouble();
        System.out.print("Enter Assestment 2: ");
        double fa2 = scanner.nextDouble();
        System.out.print("Enter Assestment 3: ");
        double fa3 = scanner.nextDouble();
        System.out.print("Enter Class Standing: ");
        double cs2 = scanner.nextDouble();
        System.out.print("Enter Interim 2 Grade: ");
        double ig2 = scanner.nextDouble();
        System.out.print("Enter Midterm Major Exam Grade: ");
        double mm2 = scanner.nextDouble();
        
        
        double avg1 =((ma1 + ma2 + ma3)/3*(0.20));
        double csr = (cs * 0.10);
        double ir1 = (ig * 0.30);
        double mmr = (mm1 * 0.40);
        double mpg = (avg1 + csr + ir1 + mmr);
        
        double avg2 = ((fa1 + fa2 + fa3)/3*(0.20));
        double csr2 = (cs2 * 0.10);
        double ir12 = (ig2 * 0.30);
        double mmr2 = (mm2 * 0.40);
        double mpg2 = (avg2 + csr2 + ir12 + mmr2);
        
        double a = (mpg * 0.40);
        double b = (mpg2 * 0.60);
        double term = (a + b);
        
        DecimalFormat df = new DecimalFormat("0.00");
        String f1 = df.format(mpg);
        String f2 = df.format(mpg2);
        String f3 = df.format(term);
        //nilagyan ko lang neto ma'am para gayang gaya sa output niyo hehe
        
        System.out.println("\n\n\n\n====FINAL COURSE====");
        System.out.print("Student name:"+sn);
        System.out.println("\t\tCourse Enrolled:"+sc);
        System.out.print("Midterm period grade: "+f1);
        
        System.out.println("\t\tFinal period grade: "+f2);
        System.out.println("Term Grade: "+f3);
        scanner.close();
        
        
    }
    
}
