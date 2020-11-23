import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_12 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int i;

        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_12 Test.java");  // case: if args are not equal to 1

            System.exit(1);
        }

        File sourceFile = new File(args[0]);    // create new sourcefile

        if (!sourceFile.exists()) {                                     // case: if file DNE
            System.out.println(sourceFile + " does not exist");
            System.exit(2);
        }

        String txt = "";

        BufferedReader readIn = new BufferedReader(new FileReader(sourceFile));     // create buffered reader

        i = readIn.read();


        while (!(i == -1)) {
            char ch = (char)(i);

            if(ch == '{') {
                int newLine = txt.lastIndexOf('\n');            // reformat sourcefile 

                txt = txt.substring(0, newLine - 1);            // create new substring 
            }

            txt = (txt + ch);

            i = readIn.read();

        }

        readIn.close();
        PrintWriter write = new PrintWriter(sourceFile);

        write.print(txt);
        write.close();
    }
}