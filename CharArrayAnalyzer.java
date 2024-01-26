/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author reyeskl
 */
public class CharArrayAnalyzer {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        char[] array = inputArray();
        int vowelCount = vowelChar(array);
        int numCount = numChar(array);
        
        displayContent(array);
        System.out.println("Number of vowel characters: " + vowelCount);
        System.out.println("Number of numeric characters: " + numCount);
    }
    
    static char[] inputArray() {
        
        System.out.print("How many characters will be stored in the array: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        
        char[] chars = new char[size];
        
        for (int i = 0; i < chars.length; i++) {
            System.out.print("Characters " + (i + 1) + ": ");
            chars[i] = scanner.nextLine().charAt(0);
        }
        
        return chars;
    }
    
    static int vowelChar(char[] chars){
        int count = 0;
        
        for(char s: chars) {
            if (s == 'a' || s == 'e'  || s == 'i' || s == 'o' || s == 'u' ||
                s == 'A' || s == 'E'  || s == 'I' || s == 'O' || s == 'U') {
                count++;
            }
        }
        
        return count;
    }
    
    static int numChar(char[] chars) {
        int count = 0;
        
        for (char s: chars) {
            if (s >= '0' && s <= '9') {
                count++;
            }
        }
        
        return count;
    }
    
    static void displayContent(char[] chars) {
        String temp = "";
        for (char s: chars) {
            temp += s;
        }
        
        System.out.println("\nThe array contains the characters: " + temp);
    }
    
    
}
