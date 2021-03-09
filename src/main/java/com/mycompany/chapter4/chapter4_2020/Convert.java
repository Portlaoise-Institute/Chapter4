
package com.mycompany.chapter4;

public class Convert {

    public static void main(String[] args) {
    
        //Casting Example
        
        float daysFloat = 365.25f;
        System.out.println("Float value: "+daysFloat);
        
        //Cast the float value as an Integer
        // 365.25 ->   365 
        //loss of precision 
        int daysInt = (int) daysFloat;
        System.out.println("Int Value: "+daysInt);
        
        //Converting Example 
        //Convert a String to an Integer 
        //            "52"  -->    52 
        String weeksString = "52"; 
        
        int weeksInt = Integer.parseInt(weeksString); 
        
        
        //Perform a calculation (365/52)= 7 days a week
        int week = (daysInt/ weeksInt);
        
        //output the result
        System.out.println("Days per week: "+week);
        
        
        
        
        
        
        
        
        
        
    } //end main
    
} //end class 
