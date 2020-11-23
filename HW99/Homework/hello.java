/***************************************************** 
 * NAME         : Kate Steer                         *
 * SECTION      : M-Th -- 7-9:20pm                   *
 * FILE NAME    : hello.java                         *
 * DATE CREATED : 6/2/2020                           *
 * DUE DATE     : 6/2/2020                           *   
 *****************************************************
 * PURPOSE:                                          *
 * -demonstrate IDE and programming constructs       *   
 *****************************************************/

public class hello{
    public static void main(String[] args){
        // constants

        final int YOUR_NUM     = 3;
        final float YOUR_FLOAT = 4.2f;
        
        // variables 

        int myNum      = 2;
        float myFloat  = 12.2f;
        boolean myBool = true;
        String myText  = "Hello World";
        int result;
        float floatResult;
        int modResult;
        int castedFloat;
    
        System.out.println(myText);

        // arithemetic 

        result      = YOUR_NUM + myNum;
        floatResult = myFloat + YOUR_FLOAT;

        System.out.println("\nThis is the result of adding " + YOUR_NUM + " and " + myNum + ":\n"); 
        System.out.println(result); 

        System.out.println("\nThis is the result of adding " +  YOUR_FLOAT + " and " + myFloat + ":\n"); 
        System.out.println(floatResult); 

        // if statements

        if(result < floatResult)
        {
            myBool = false;
        }

        if(myBool)
        {
            System.out.println("\nInteger result is bigger than float result");
        }
        else
        {
            System.out.println("\nInteger result is less than float result");
        }

        // type casting

        castedFloat = (int)floatResult;

        System.out.println("\nOriginal Float: " + floatResult + " -> Type casted into int:  " + castedFloat);

        // mod 

        modResult = result % 2;

        System.out.println("\nMod 2 for " + result + ": " + modResult);

        // switch

 




 



    }
}