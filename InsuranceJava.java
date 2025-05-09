/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insurance.java;

/**
 *
 * @author tshis
 */

import java.util.Scanner;

public class InsuranceJava {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Enter your birth year: ");
        int birthYear = Scanner.nextInt();
        
        System.out.print("Enter the current year: ");
        int currentyear = Scanner.nextInt();
        
        double premium = calculatePremium(currentyear, birthYear);
        
        System.out.println("your annual insurence premium is: $" + String.format("%.2f", premium));
        
     Scanner.close();
    }
    
    
    
    public static double calculatePremium(int currentYear, int birthYear){
        int currentAge = currentYear - birthYear; 
        int agedecade = currentAge/ 10;    
        int premium = (agedecade+15)*20 ;
        
      return premium;  
    }
}

