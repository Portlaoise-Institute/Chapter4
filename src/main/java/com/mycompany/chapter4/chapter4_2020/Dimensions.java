package com.mycompany.chapter4;

public class Dimensions {
  
    public static void main(String[] args) {
        
        //Create a 2-d boolean array
        //to store xy coordinates 
        //default array elements 
        //values are set to false 
        boolean[][] points = new boolean[5][20]; //r&c
                    
        //Define one Y point on each X axis
        points[0][5] = true; //row 1 col 6
        points[1][6] = true; //row 2 col 7
        points[2][7] = true; //row 3 col 8 
        points[3][8] = true; //row 4 col 9 
        points[4][9] = true; //row 5 col 10
        
        //Add a for loop to iterate through 
        //the first array index 
        //adding a new line character at the
        //end of each iteration
        for (int i=0; i<points.length; i++)
        {
            System.out.print("\n");
            //Add a for loop to output
            //a character for each element
            //according to the element's
            //boolean value 
            for (int j=0; j <points[0].length; j++)
            {
//               System.out.print(points[i][j]+ " ");
             char mark = (points[i][j])?'X' :'-';
             System.out.print(mark);   //points[i][j]
            } //end inner for 
           
        } //end outer for 
        
        
    } //end main 

} //end class
