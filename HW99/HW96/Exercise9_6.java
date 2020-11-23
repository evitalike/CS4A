import java.time.LocalDateTime;

public class Exercise9_6{

    public static void main(String[] args) {

        double[] sortedArr = new double[1000];        // create array

        for(int i = 0; i < 1000; i++)
        {
            sortedArr[i] = (Math.random() * 1000);   // populate array
        }

        StopWatch stopwatch = new StopWatch();

        stopwatch.start();                          // start time
        selectionSort(sortedArr);                   // sort array
        stopwatch.stop();                           // end time 



        System.out.print("The elapsed time for the selection sort is: " + stopwatch.elapsedTime() + " miliseconds.");
    }

    /**
     * selectionSort (sorts array using a selection sort method)
     * @param array
     */
    public static void selectionSort(double[] array)
    {
        int smallestIndex;
        double temp;

        for(int i = 0; i < array.length; i++)
        {
            smallestIndex = i;
                    
            for (int loc = i + 1; loc < array.length; loc++)
            {
                 if (array[loc] < array[smallestIndex])
                 {
                    {
                            smallestIndex = loc;
                    }

                    temp = array[smallestIndex];
                    array[smallestIndex] = array[i];
                    array[i] = temp;
                 }
            }
        }
    }
}
