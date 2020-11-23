import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise11_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();  // create new list

        System.out.print("Enter ten integers: ");

        for (int i = 0; i < 10; i++) {      // populate arraylist
            list.add(in.nextInt());
        }

        removeDuplicate(list);      //call removeDuplicate 

        System.out.print("\nThe distinct integers are ");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

    /**
     * removeDuplicate
     * @param list (ArrayList<Integer>)
     * - removes duplicate numbers 
     */
    public static void removeDuplicate(ArrayList<Integer> list) {

        // for loop - goes through list and removes duplicate
        for (int i = 0; i < list.size() - 1; i++) {
            for (int x = i + 1; x < list.size(); x++) {
                if (list.get(i) == list.get(x)) {
                    list.remove(x);
                }
            }

        }
    }
}