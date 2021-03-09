
package com.mycompany.chapter4;


public class Elements {

    
    public static void main(String[] args) {
     
        //Insert initialised int arrays
        //representing the monthly
        //kiosk sales Jan -Dec 
        //for all four quarters of the year
        int[] kiosk_q1 ={42000, 48000, 50000}; //Jan-Mar
        int[] kiosk_q2 ={52000, 58000, 60000}; //Apr-Jun
        int[] kiosk_q3 ={46000, 49000, 58000}; //Jul-Sep
        int[] kiosk_q4 ={50000, 51000, 61000}; //Oct-Dec
        
        //Insert initialised int arrays
        //representing the monthly
        //outlet sales Jan - Dec 
        //for all four quarters of the year
        int[] outlet_q1 ={57000, 63000, 60000}; //Jan-Mar
        int[] outlet_q2 ={70000, 67000, 73000}; //Apr-Jun
        int[] outlet_q3 ={67000, 65000, 62000}; //Jul-Sep
        int[] outlet_q4 ={72000, 69000, 75000}; //Oct-Dec
        
        //Create an empty int array
        //of tweleve elements 
        //to combine all the monthly sales figures 
        //and int variable to record the grand total 
        
        int[] sum = new int[12];
        int total = 0; // record total sales 
        
        //Add for loop to populate each element 
        //of the empty array 
        //with the combined values from the
        //other arrays
        for (int i=0; i<kiosk_q1.length; i++)
        {
         sum[i] = kiosk_q1[i] + outlet_q1[i];
         sum[i+3] =kiosk_q2[i] + outlet_q2[i];
         sum[i+6] =kiosk_q3[i] + outlet_q3[i];
         sum[i+9] =kiosk_q4[i] + outlet_q4[i];
        } //end for loop 
          
        
        
        //add a second for loop 
        //to output each of the combined monthly sales 
        //and to calculate their grand total 
        for (int i=0; i <sum.length; i++)
        {
            System.out.println("Month "+ (i+1 )+
                    " sales:\t"+ sum[i]);
            //total = total + sum[i];
            total +=sum[i]; //keeps a running total
        } //end of for loop 
        
        System.out.println("TOTAL YEAR SALES\t" + total);
        
        
        
        
    } //end main 
                
        
} //end class
