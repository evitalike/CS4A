/***************************************************** 
 * NAME         : Kate Steer                         *
 * SECTION      : M-Th -- 7-9:20pm                   *
 * FILE NAME    : Problem630.java                    *
 * DATE CREATED : 6/10/2020                          *
 * DUE DATE     : 6/10/2020                          *   
 *****************************************************
 * PURPOSE:                                          *
 * - create a game of craps that allows the user to  *   
 *   roll two dies                                   *
 * - decide game based on random rolls               *
 *****************************************************/

public class Problem630
{
    
    public static void main(String[] args) {
        
        //VARIABLES
        int decision;   // from decideGame
        int points = 0; // number from sum (init. to 0)

        //DO WHILE loop - runs while -1 (meaning continue game)
        do{

            int num1 = rollDice();       // call roll dice (get random num 1 - 6)
            int num2 = rollDice();       // 
            int sum  = add(num1, num2);  // add two random numbers

            if(points == sum)
            {
                System.out.println("You won.");  // if user rolls the same value twice, break DO-WHILE loop, win game
                decision = 1;
            }
            else
            {
                decision = decideGame(sum);     // calls decide game, see win, loss or continue game
            }

            points = sum;   // stores sum into points to compare to new sum

        }while(decision == -1);

    }


      /**
     * rollDice 
     * - gives user random number from dice
     * @return int (random num from 1 - 6)
     */
    public static int rollDice()
    {
        return (int)(Math.random() * 6) + 1;
    }

    /**
     * add
     * - adds parameters 
     * @param num1 (number from rollDice())
     * @param num2 (number from rollDice())
     * @return int (sum of two numbers)
     */
    public static int add(int num1, int num2)
    {
        int sum = num1 + num2;
        System.out.println("You rolled " + num1 + " + " + num2 + " = " + sum);
        return sum;
    }

    /**
     * decideGame
     * @param sum (sum of two random dice numbers)
     * @return int (1 if win, 0 if lose, -1 if game continues)
     */
    public static int decideGame(int sum)
    {
        int choice;

        if(sum == 7 || sum == 11)  // WIN
        {
            choice = 1;
            System.out.println("You won.");
        }
        else if(sum == 2 || sum == 3 || sum == 12)  // LOSE
        {
            choice = 0;
            System.out.println("You lost.");    // CONTINUE
        }
        else
        {
            choice = -1;
            System.out.println("Point is " + sum);
        }

        return choice; // return choice num
    }
}