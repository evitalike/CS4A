import java.util.Scanner;

public class Exercise10_22 {
    public static void main(String[] args) {

        char[] charArr = { 'T', 'e', 's', 'T' };
        char[] charArr2 = { 'T', 'E', 's', 'T' };

        // CREATE 3 Tests
        MyString1 test = new MyString1(charArr);
        MyString1 test2 = new MyString1(charArr2);
        MyString1 number = MyString1.valueOf(50);

        MyString1 substring = test.substring(1, 3);   // substring
        MyString1 lowercase = test.lowercase();       // lowercase

        System.out.print("Test 1: ");
        for (int i = 0; i < test.length(); i++) {
			System.out.print(test.charAt(i));		
        }
        
        System.out.println("\nCharacter At Index 1: " + test.charAt(1));  // character at
        
        System.out.println("Length: " + test.length());                   // length

        System.out.print("Substring (1 - 3): ");                          // print substring 
        for (int i = 0; i < substring.length(); i++) {
			System.out.print(substring.charAt(i));		
        }

        System.out.print("\nTo Lowercase: ");                             // print lowercase
        for (int i = 0; i < lowercase.length(); i++) {
			System.out.print(lowercase.charAt(i));		
        }

        System.out.println();

        System.out.print("Test 2: ");
        System.out.print(charArr2);

        System.out.println("\nTest 1 is equal to Test 2: " + test.equals(test2)); // equals

        System.out.print("Value of 50: ");
        for (int i = 0; i < number.length(); i++) {
			System.out.print(number.charAt(i));		
		}

    }
}