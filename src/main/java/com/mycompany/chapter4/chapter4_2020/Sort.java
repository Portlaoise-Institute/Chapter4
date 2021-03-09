//  Example from page 126 - 127 Course Book 

package com.mycompany.chapter4;

import java.util.Arrays;

public class Sort {

 
    public static void main(String[] args) {
      
        //Declare and initialise two arrays
        String[] names = {"Mike", "Dave", "Andy"};
        int[] nums = {200, 300, 100 };
        
        //Output the contents of the arrays
        display(names);
        display(nums);
        
        //Sort the arrays
        Arrays.sort(names);
        Arrays.sort(nums);
        
        //Output the sorted arrays
        display(names);
        display(nums);
        
    } //end main 

    public static void display(String[] elems) {
        System.out.println("\nString Array");
        for (int i=0; i<elems.length;i++)
        {
            System.out.println("Element "+i+" is "
            + elems[i]);
        }
    }//end method

    public static void display(int[] elems) {
        System.out.println("\nInteger Array");
        for (int i=0; i<elems.length;i++)
        {
            System.out.println("Element "+i+" is "
            + elems[i]);
        }
    }
    
} //end class 
