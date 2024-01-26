/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author reyeskl
 */
public class BarangaySchemeValidator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("******************************************************************");
        System.out.println("*MUNICIPALITY OF LOS BAÑOS LAGUNA ODD-EVEN MARKET SCHEDULE SCHEME*");
        System.out.println("******************************************************************\n");
        
        System.out.println("Code of Barangay's in Los Baños Laguna:");
        System.out.println("\tA - Anos");
        System.out.println("\tB - Batong Malake");
        System.out.println("\tC - Baybayin");
        System.out.println("\tD - Bayog");
        System.out.println("\tE - Malinta");
        System.out.println("\tF - Tadlac");
        System.out.println("\tG - Tungtungin putho");
        System.out.println("\tH - Bagong Silang");
        System.out.println("\tI - Bambang");
        System.out.println("\tJ - Lalakay");
        System.out.println("\tK - Maahas");
        System.out.println("\tL - Mayondon");
        System.out.println("\tM - San Antonio");
        System.out.println("\tN - Timugan");
        
        
        
        System.out.print("\nEnter your barangay code > ");
        String code = sc.nextLine();
        
        System.out.print("Enter the day today > ");
        int day = sc.nextInt();
        
        String result = (code.equalsIgnoreCase("A") && !(day % 2 == 0))? "You are alowed to enter on ODD day scheme" :
                        (code.equalsIgnoreCase("B") && !(day % 2 == 0))? "You are alowed to enter on ODD day scheme" :
                        (code.equalsIgnoreCase("C") && !(day % 2 == 0))? "You are alowed to enter on ODD day scheme" :
                        (code.equalsIgnoreCase("D") && !(day % 2 == 0))? "You are alowed to enter on ODD day scheme" :
                        (code.equalsIgnoreCase("E") && !(day % 2 == 0))? "You are alowed to enter on ODD day scheme" :
                        (code.equalsIgnoreCase("F") && !(day % 2 == 0))? "You are alowed to enter on ODD day scheme" :
                        (code.equalsIgnoreCase("G") && !(day % 2 == 0))? "You are alowed to enter on ODD day scheme" : 
                        (code.equalsIgnoreCase("H") && day % 2 == 0)? "You are alowed to enter on EVEN day scheme" : 
                        (code.equalsIgnoreCase("I") && day % 2 == 0)? "You are alowed to enter on EVEN day scheme" : 
                        (code.equalsIgnoreCase("J") && day % 2 == 0)? "You are alowed to enter on EVEN day scheme" : 
                        (code.equalsIgnoreCase("K") && day % 2 == 0)? "You are alowed to enter on EVEN day scheme" : 
                        (code.equalsIgnoreCase("L") && day % 2 == 0)? "You are alowed to enter on EVEN day scheme" : 
                        (code.equalsIgnoreCase("M") && day % 2 == 0)? "You are alowed to enter on EVEN day scheme" : 
                        (code.equalsIgnoreCase("N") && day % 2 == 0)? "You are alowed to enter on EVEN day scheme" : "\nNOT YOUR MARKET SCHEDULE SCHEME.\nBARANGAY CODE IS NOT RECOGNIZED";
                
                        
        System.out.println(result);
        
        System.out.print("\nEnter you temperature: ");
        double temperature = sc.nextDouble();
        
        String observe = (temperature < 37.5)? "Welcome! Please wear your facemask at all times." : "Your temperature is not normal";
        System.out.println(observe);
        
    }
}
