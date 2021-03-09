
package com.mycompany.chapter4;


public class Exceptions {

  
    public static void main(String[] args) {
     
        //try
        //to output a single 
        //integer arguement
        try
        {
            int num = Integer.parseInt(args[0]);
            System.out.println("You entered: "+num);
        } //end try
        catch (ArrayIndexOutOfBoundsException e)
                {
                    // to handle the exception
                    //that arises
                    //when the program is run
                    //without an argument 
                    System.out.println("Integer"
                            + "argument required");
                } //end of catch
        catch (NumberFormatException e)
        {
            //Occurs if the program
            //is run with a non-integer argument 
            System.out.println("Argument is wrong format");
        } //end catch
        finally {
            //Code that will always execute regardless
            //of error messages 
            System.out.println("Program end.");
        } //end finally 
        
    } //end main 

} //end class 
