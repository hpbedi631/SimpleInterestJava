/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericcomputingsimpleinterest;

import java.util.Scanner;

/**
 *
 * @author macbookpro
 */
public class NumericComputingSimpleInterest {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        SimpleInterest si = new SimpleInterest();
        
        System.out.println("Please enter your Principal : ");
        double principal = sc.nextDouble();
        
        System.out.println("Do you want to enter your rate value in p.a. or p.m.? ");
        System.out.println("Please enter 1 for p.a. or 2 for p.m. ");
        
        int choice = sc.nextInt();
        if (choice==1) {
            System.out.println("Please enter your rate value in p.a.");
        } else {
            System.out.println("Please enter your rate value in p.m.");
        }        
        double rate = sc.nextDouble();
        
        System.out.println("Please enter your period in Years : ");
        double periodYear = sc.nextDouble();
        
        System.out.println("Please enter the period in Months : ");
        double periodMonths = sc.nextDouble();
        
        System.out.println("Please enter the period in Days : ");
        double periodDays = sc.nextDouble();
        
        si.setPrincipal(principal);
        si.setRate(rate);
        si.setPeriodYears(periodYear);
        si.setPeriodMonths(periodMonths);
        si.setPeriodDays(periodDays);
        
        System.out.println(si.toString());
      
    }
    
}
