import java.util.Scanner;

/***************************************************** 
 * NAME         : Kate Steer                         *
 * SECTION      : M-Th -- 7-9:20pm                   *
 * FILE NAME    : Problem719.java                    *
 * DATE CREATED : 6/10/2020                          *
 * DUE DATE     : 6/10/2020                          *   
 *****************************************************
 * PURPOSE:                                          *
 * - create method to decide if a list is sorted or  *
 *   not                                             *       
 *****************************************************/

public class Problem719 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // VARIABLES
            boolean sorted; // true if sorted, false if not

            System.out.print("Enter list: ");   // enters num 
            
            int listLength = input.nextInt();   // first num = list length
            int[] list = new int[listLength];   // array of ints (size = list length)

            for(int i = 0; i < listLength; i++)
            {
                list[i] = input.nextInt();      // full list
            }

            System.out.println();
            System.out.print("This list is ");

            if(isSorted(list))
            {
                System.out.print("sorted.");        //call function isSorted, if true - list is sorted
            }
            else
            {
                System.out.print("not sorted.");    //call function isSorted, if false - list is not sorted
            }

            input.close();

        }
    
        /**
         * isSorted
         * - checks if list is sorted by comparing items in array
         * @param list (array of ints)
         * @return bool (true if sorted, false if not)
         */
        public static boolean isSorted(int[] list)
        {
            boolean sorted = true;

            for(int i = 0; i < list.length - 1; i++)
            {
                if(list[i] > list[i + 1]) // if neighbour is less, array is not sorted
                {
                    sorted = false;
                }
            }

            return sorted;
        }
}