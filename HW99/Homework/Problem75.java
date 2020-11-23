import java.util.Scanner;

/***************************************************** 
 * NAME         : Kate Steer                         *
 * SECTION      : M-Th -- 7-9:20pm                   *
 * FILE NAME    : Problem75.java                     *
 * DATE CREATED : 6/10/2020                          *
 * DUE DATE     : 6/10/2020                          *   
 *****************************************************
 * PURPOSE:                                          *
 * - Input 10 numbers, create a program to find      *
 *   distinct numbers.                               *   
 *****************************************************/

public class Problem75{
    public static void main(String[] args) {

        Scanner input       = new Scanner(System.in);

        //VARIABLES 
        int[] distNumArr    = new int[10]; // array of ten integers
        int distinctCount   = 0;           // number of distinct numbers
    
        System.out.println("Enter ten numbers: "); // input

        //FOR loop - loops 10 times, recieves input and decides whether it is a distinct number (stores in array if so)
        for(int i = 0; i < 10; i++)
        {
            boolean isDistinctNum = true;   // bool - decides whether num is distinct
            int num = input.nextInt();      // input 

            //FOR loop - loops for distinct number count, decides whether num is similar to any nums within the array
            for(int x = 0; x < distinctCount; x++)
            {
                if(num == distNumArr[x])
                {
                    isDistinctNum = false;
                }
            }
            
            //IF true - stores number in array
            if(isDistinctNum == true)
            {
                distNumArr[distinctCount] = num;
                distinctCount++;
            }

        }   
            

        System.out.println("The number of distinct numbers is " + distinctCount);
        System.out.println("The distinct numbers are");

        //PRINT number array
        for(int i = 0; i < distinctCount; i++)
        {
            System.out.print(" " + distNumArr[i]);
        }

        


        input.close(); 
        
    }
}