
package com.mycompany.chapter4.chapter4_2020;


public class Array {

   
    public static void main(String[] args) {
       
        //Declare and initialising a String 
        //array with 3 elements
        String[] str = {"Much ","More"," Java"};
        
        //Declare an empty integer array with 3 elements
        int[] num = new int[3];
        
        //Populate the integer array
        //Assign values to the integer elements
        num[0] =100;
        num[1] =200;
        num[2] =300;
        
        //Assign a new value to the second element
        //in the string array
        str[1] = "Better";
        
        //Output the length of each array and the content
        //of all elements in each array
        System.out.println("String array length is: " +str.length);
        System.out.println("Integer array length is: " +num.length);
        
        System.out.println(num[0]+","+num[1]+","+num[2]);
        System.out.println(str[0]+str[1]+str[2]);
        
    } //end main 
    
} //end class 
