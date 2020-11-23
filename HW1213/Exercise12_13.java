import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Exercise12_13 {
    public static void main(String[] args) throws Exception{
        String txt;
        int lineCount = 0;
        int charCount = 0;
        int wordCount = 0;

        File file = new File("Text");
        FileInputStream fStream = new FileInputStream(file);        // new file stream
        InputStreamReader in = new InputStreamReader(fStream);      // new input reader
        BufferedReader readIn = new BufferedReader(in);             // new buffer read

        // while text is in file 
        while((txt = readIn.readLine()) != null) {
            charCount = charCount + txt.length();       // character count is character count + length of text

            String [] words = txt.split("\\s+");        // array for words
            String [] lines = txt.split("\\n+");        // array for lines

            lineCount  = lineCount + lines.length;
            wordCount  = wordCount + words.length;      
        }

        System.out.println("Lines: " + lineCount);
        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);


    }
    
}