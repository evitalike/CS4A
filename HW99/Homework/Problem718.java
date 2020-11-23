import java.util.Scanner;

/***************************************************** 
 * NAME         : Kate Steer                         *
 * SECTION      : M-Th -- 7-9:20pm                   *
 * FILE NAME    : Problem718.java                    *
 * DATE CREATED : 6/10/2020                          *
 * DUE DATE     : 6/10/2020                          *   
 *****************************************************
 * PURPOSE:                                          *
 * - create a bubble sort method to sort a list of   *
 *   ten numbers (low to high)                       *          
 *****************************************************/

public class Problem718 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // VARIABLES
        double[] arr = new double[10];  // array of 10 doubles

        System.out.println("Enter ten numbers: ");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextDouble();        // pop. array of 10 doubles
        }

        bubbleSort(arr); // call bubble sort

        System.out.println("The array after sort is: ");

        for (int i = 0; i < arr.length; i++) {      // print new sorted list 
            System.out.println(arr[i]);
        }

        input.close();

    }

        /**
     * bubbleSort
     * - uses bubble sort method to sort list 
     * - compares neighbours and swap
     * @param list - array of doubles
     */
    public static void bubbleSort(double[] list) {

        boolean needNextPass = true;  // decides whether loop exits or continues
        
        // FOR loop - loops list length 
        for (int k = 1; k < list.length && needNextPass; k++) {

          needNextPass = false;

          for (int i = 0; i < list.length - k; i++) {   
            if (list[i] > list[i + 1]) { // if neighbour is more
                double temp = list[i];
                list[i] = list[i + 1];   // swap two numbers
                list[i + 1] = temp;
            }
          }
         needNextPass = true;  // needNextPass is true
        }
    }
}