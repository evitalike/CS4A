import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_11 {
    public static void main(String[] args) throws FileNotFoundException {

        String word = args[0];      // first arguement of command line
        String file = args[1];      // second arguement of command line

        Scanner in = new Scanner(new File(file)); // create new scanner that reads from file

        // read in input
        while(in.hasNextLine()) {
            String str = in.nextLine();
            str = str.replaceAll(word, " "); //replace word with " "
            System.out.println(str);
        }

        


    }
}