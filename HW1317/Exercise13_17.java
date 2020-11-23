import java.util.Scanner;

public class Exercise13_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter in the first complex number: ");    // input 1st number 
        double x = in.nextDouble();
        double y = in.nextDouble();

        System.out.print("Enter in the second complex number: ");  // input 2nd number
        double w = in.nextDouble();
        double z = in.nextDouble();

        // create two complex numbers
        Complex c = new Complex(x, y);
        Complex c2 = new Complex(w, z);

        //demonstrate complex functions\
        System.out.println(c + " + " + c2 + " = " + (c.add(c2)));
        System.out.println(c + " - " + c2 + " = " + (c.subtract(c2)));
        System.out.println(c + " * " + c2 + " = " + (c.multiply(c2)));
        System.out.println(c + " / " + c2 + " = " + (c.divide(c2)));
        System.out.println("|" + c + " | = " + (c.abs()));

    }
}