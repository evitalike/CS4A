import java.util.Scanner;

/***************************************************** 
 * NAME         : Kate Steer                         *
 * SECTION      : M-Th -- 7-9:20pm                   *
 * FILE NAME    : Keychain.java                      *
 * DATE CREATED : 6/6/2020                           *
 * DUE DATE     : 6/8/2020                           *   
 *****************************************************
 * PURPOSE:                                          *
 * - create keychain shop, allowing user to add      *  
 *   keychains, delete keychains, view order and     *
 *   checkout                                        *
 *****************************************************/

public class Keychain {

    /**
     * addKeychains: - prompts user for the number of keychains they would like to add
     *               - input added to total keychain count 
     * Parameters:  total keychain count (int keychainCount)
     * Return value: new keychain count from user input
    */
    public static int addKeychain(int keychainCount){

        Scanner input = new Scanner(System.in);

        //VARIABLes
        int addNum;             // number of keychains from user input 
        boolean invalidNum;     // bool to check valid input

        //DO-WHILE loop - error checks user input, prompts user for input num
        do{

            System.out.println("You have " + keychainCount + " keychains. How many to add? ");
            addNum = input.nextInt();

            invalidNum = addNum < -1;

            if(invalidNum){
                System.out.println("ERROR - must be valid number");
            }

        }while(invalidNum);

        keychainCount += addNum;    // add number from user to total keychain count
    
        System.out.println("You now have " + keychainCount + " keychains.\n");

        return keychainCount;       // returns new keychain count
    }

    
    /**
     * deleteKeychain: - prompts user for the number of keychains they would like to delete
     *                 - input delete to total keychain count 
     * Parameters:  total keychain count (int keychainCount)
     * Return value: new keychain count from user input
    */
    public static int deleteKeychain(int keychainCount){

        Scanner input = new Scanner(System.in);

        //VARIABLES 
        int deleteNum;          // number of keychains from user input
        boolean invalidNum;     // bool to error check valid input

        //DO-WHILE loop - error checks user input, prompts user for input num
        do{

            System.out.println("You have " + keychainCount + " keychains. How many to remove? ");
            deleteNum = input.nextInt();

            invalidNum = deleteNum < -1;

            if(invalidNum){
                System.out.println("ERROR - must be valid number");
            }

        }while(invalidNum);

        keychainCount -= deleteNum;     // delete number from user input from total keychain count
        
        System.out.println("You now have " + keychainCount + " keychains.\n");

        return keychainCount;           // returns new keychain count
    }

    
    /**
     * viewOrder: - prints keychain count, how much each costs and total cost of order
     * Parameters:  total keychain count (int keychainCount)
     * Return value: void
    */
    public static void viewOrder(int keychainCount){

        System.out.println("You have " + keychainCount + " keychains.");        // current number of keychains
        System.out.println("Keychains cost $10 each.");                         // cost of each keychain
        System.out.println("Total cost is $" + (keychainCount * 10) + ".\n");   // total cost of order
    }

    
    /**
     * checkout: - calls viewOrder to print out order information
     *           - from user input name, prints out checkout message
     * Parameters:  total keychain count (int keychainCount)
     * Return value: void
    */
    public static void checkout(int keychainCount){

        Scanner input = new Scanner(System.in);

        //VARIABLES
        String name;    // name from user input

        System.out.println("\n\tCHECKOUT\n");
        System.out.println("What is your name? ");      // prompts user for name
        name = input.nextLine();

        viewOrder(keychainCount);       // calls viewOrder to print order info
        System.out.println("\nThanks for your order, " + name + ".\n\n");       // checkout message

    }



    /**
     * menu: - prints menu for shop
     *       - error checks user input
     * Return value: menu choice
    */
    public static int menu()
    {
        Scanner input = new Scanner(System.in);

        //VARIABLES 
        int numChoice;              // number choice from user input
        boolean invalidChoice;      // bool to check valid input

        //DO-WHILE LOOP - error checks user input, prints menu options
        do{
            System.out.println("1. Add Keychains to Order\n");
            System.out.println("2. Remove Keychains from Order\n");
            System.out.println("3. View Current Order\n");
            System.out.println("4. Checkout\n");

            System.out.print("\nPlease enter your choice: ");
            numChoice = input.nextInt();

            invalidChoice = numChoice != 1 && numChoice != 2 && numChoice != 3 && numChoice != 4 && numChoice != -1;

            if(invalidChoice)
            {
                System.out.println("ERROR - Please enter in number 1-4\n");
            }

        }while(invalidChoice);

        return numChoice;       // return menu choice number 
    }

    // MAIN 
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //VARIABLES
        int keychains = 0;  // number of keychains (init. 0)
        int choice;         // number choice (returned from method menu())

        System.out.println("\nYe Olde Keychain Shop\n");

        choice = menu();  // choice returned from menu()

        //WHILE loop - exit value -1
        while(choice != -1){

            //SWITCH - calls methods based on menu choice 
            switch(choice){
                case 1: keychains = addKeychain(keychains);        // calls addKeychain - returns new keychain count
                        break;
                case 2: keychains = deleteKeychain(keychains);     // calls deleteKeychain - returns new keychain count
                        break;
                case 3: viewOrder(keychains);                      // calls viewOrder - prints order info
                        break;
                case 4: checkout(keychains);                       // calls checkout - prints order info (from viewOrder) and checkout message
                        break;
            }

            choice = menu();

        }
    }
}