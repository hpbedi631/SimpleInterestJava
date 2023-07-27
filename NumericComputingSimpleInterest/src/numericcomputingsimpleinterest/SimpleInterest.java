/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericcomputingsimpleinterest;

/**
 *
 * @author macbookpro
 */
public class SimpleInterest {

    private double principal;
    private double rate;
    private double periodYears;
    private double periodMonths;
    private double periodDays;
    private int choice;
    
    public SimpleInterest() {
        
    }
    
    public SimpleInterest(double principal, double rate, double periodYears) {
         this.principal = principal;
         this.rate = rate;
         this.periodYears = periodYears;
    }
    
    
    public double getPrincipal() {
     return principal;
    }

    public double getRate() {
    return rate;
    }

    public double getPeriod() {
        return periodYears + periodMonths / 12 + periodDays / 365;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setRate(double rate) {
        if (choice==1) {
            this.rate = rate/100;
            
        } else {
            this.rate = rate/100 * 12;
        }
    }

    public void setPeriodYears(double periodYears) {
        this.periodYears = periodYears;
    }

    public void setPeriodMonths(double periodMonths) {
        this.periodMonths = periodMonths;
    }

    public void setPeriodDays(double periodDays) {
        this.periodDays = periodDays;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }
    
    

    public double getSimpleInterest() {
        return getPrincipal() * getRate() * getPeriod();
    }

    public double getMaturityValue() {
        return getPrincipal() + getSimpleInterest();
    }

    @Override
    public String toString() {   
        
        String time = ""; 
        double timeValue = 0;
        String papmStore = "";
        double rateVal = 0;
        
        if (periodYears != 0) {
            time = " years";
            timeValue = getPeriod();
        } else if (periodMonths != 0) {
            time = " months";
            timeValue = periodMonths;
        } else {
            time = " days";
            timeValue = periodDays;
        }
        
        if (choice == 1) {
           papmStore = "p.a.";
           rateVal = getRate() * 100;
        } else {
            papmStore = "p.m.";
            rateVal = getRate()/12 * 100;
        } 
        
        String print = "Simple Interest for $" + getPrincipal() + " at " + rateVal + "% " + papmStore + " for " + timeValue + time + " = $" + getSimpleInterest();
        print += "\nThe maturity value of $" + getPrincipal() + " an interest of " + rateVal + "% " + papmStore + " for " + timeValue + time + " = $" + getMaturityValue();
        return print;
    }
}
