import java.util.Scanner;

/***************************************************** 
 * NAME         : Kate Steer                         *
 * SECTION      : M-Th -- 7-9:20pm                   *
 * FILE NAME    : Problem421.java                    *
 * DATE CREATED : 6/4/2020                           *
 * DUE DATE     : 6/4/2020                           *   
 *****************************************************
 * PURPOSE:                                          *
 * -use if-else, if statements to error check a SSN  *   
 *****************************************************/

public class Problem421 {
   
    public static void main(String[] args) {

        // VARIABLES
        String sSN;

        // Scanner function 
        Scanner input = new Scanner(System.in);

        // User input (string)
        System.out.print("Please enter in social security #: ");
        sSN = input.nextLine();

        //IF SSN length is 11 
        if (sSN.length() == 11)
        {
            //IF SSN has dashes in correct places (using index of functions)
            if (sSN.indexOf('-') != 3 && sSN.lastIndexOf('-') != 6)
            {
                // NOT VALID
                System.out.println(sSN + " is not a valid social security number");
            }
            //ELSE IF SSN does not contain digits in correct places 
            else if (!Character.isDigit(sSN.charAt(0)) ||
                     !Character.isDigit(sSN.charAt(1)) ||
                     !Character.isDigit(sSN.charAt(2)) ||
                     !Character.isDigit(sSN.charAt(4)) ||
                     !Character.isDigit(sSN.charAt(5)) ||
                     !Character.isDigit(sSN.charAt(7)) ||
                     !Character.isDigit(sSN.charAt(8)) ||
                     !Character.isDigit(sSN.charAt(9)) ||
                     !Character.isDigit(sSN.charAt(10)))
            {
                    // NOT VALID
                    System.out.println(sSN + " is not a valid social security number");
            }
            // ELSE is valid
            else
            {
                    System.out.println(sSN + " is a valid social security number");
            }

        }
        // ELSE is valid 
        else
        {
            System.out.println(sSN + " is a not valid social security number");
        }

        input.close();

        }
}