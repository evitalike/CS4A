/***************************************************** 
 * NAME         : Kate Steer                         *
 * SECTION      : M-Th -- 7-9:20pm                   *
 * FILE NAME    : Problem34.java                     *
 * DATE CREATED : 6/4/2020                           *
 * DUE DATE     : 6/4/2020                           *   
 *****************************************************
 * PURPOSE:                                          *
 * -use Math class and random method to select a     *
 *  random month                                     *   
 *****************************************************/

public class Problem34 {

    public static void main(String[] args) {

        // VARIABLES 
        int randInt;
        String randMonth = "DEFAULT";

        // Get random int (multiply by 12 and add one)
        randInt = (int)(Math.random() * 12) + 1;

        // SWITCH - assigns month to variable randMonth based off randInt(random int)
        switch(randInt){
            case 1:  randMonth = "January";
                     break;
            case 2:  randMonth = "February";
                     break;
            case 3:  randMonth = "March";
                     break;
            case 4:  randMonth = "April";
                     break;
            case 5:  randMonth = "May";
                     break;
            case 6:  randMonth = "June";
                     break;
            case 7:  randMonth = "July";
                     break;
            case 8:  randMonth = "August";
                     break;
            case 9:  randMonth = "September";
                     break;
            case 10: randMonth = "October";
                     break;
            case 11: randMonth = "November";
                     break;
            case 12: randMonth = "December";
                     break;
        }

        // Print month and int 
        System.out.println("Month: " + randMonth + " --> From random value " + randInt);

    }
    
}