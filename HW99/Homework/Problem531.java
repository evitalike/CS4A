
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

/***************************************************** 
 * NAME         : Kate Steer                         *
 * SECTION      : M-Th -- 7-9:20pm                   *
 * FILE NAME    : Problem531.java                    *
 * DATE CREATED : 6/4/2020                           *
 * DUE DATE     : 6/4/2020                           *   
 *****************************************************
 * PURPOSE:                                          *
 * -use loop to calculate percent increase per month * 
 *  from user input                                  *  
 *****************************************************/
public class Problem531 {
    public static void main(String[] args) {
        
        // Scanner 
        Scanner input = new Scanner(System.in);

        // Decimal format
        NumberFormat form = new DecimalFormat("#0.00");

        // VARIABLES 
        double deposit;
        double percYield;
        int months;
        
        // User input
        System.out.print("Enter in the intiial deposit amount: ");
        deposit = input.nextDouble();

        System.out.print("Please enter in annual percentage yield: ");
        percYield = input.nextDouble();

        System.out.print("Enter maturity period (number of months): ");
        months = input.nextInt();

        System.out.println("Month \t CD Value");

        //FOR loop - loops from user input of months
        for(int i = 0; i < months; i++)
        { 
            // Calculates monthly percentage increase 
            deposit += deposit * percYield /1200;
            System.out.println(i + " \t " + form.format(deposit));
        }
        
        input.close();
        
    }
}