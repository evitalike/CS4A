import java.text.DecimalFormat;

public class Complex implements Cloneable {

    private double a;
    private double b;

    // constructors

    Complex() {
        a = 0;
        b = 0;
    }

    Complex(double a) {
        this.a = a;
        b = 0;
    }

    Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // real part

    public double getRealPart() {
        return a;
    }

    // imaginary part

    public double getImaginaryPart() {
        return b;
    }

    // functions

    /**
     * add
     * @param C
     * @return complex (new complex number)
     */
    Complex add(Complex C) {
        Complex add = new Complex(C.a + this.a, C.b + this.b);

        return add;
    }

    /**
     * subtract
     * @param C
     * @return subtract (new complex number)
     */
    Complex subtract(Complex C) {
        Complex subtract = new Complex(this.a - C.a, this.b - C.b);

        return subtract;
    }

    /**
     * multiply
     * @param C
     * @return multiply (new complex number)
     */
    Complex multiply(Complex C) {
        Complex multiply = new Complex(this.a * C.a - b * C.b, b * C.a + a * C.b);

        return multiply;
    }

    /**
     * divide
     * @param C
     * @return divide (complex number)
     */
    Complex divide(Complex C) {
        Complex divide = new Complex((a * C.a + b * C.b) / (C.a * C.a + C.b * C.b),
                (b * C.a - a * C.b) / (C.a * C.a - C.b * C.b));
        return divide;
    }

    /**
     * abs
     * @return absolute (double)
     */
    double abs() {
        return (Math.sqrt(b * b + a * a));
    }

    // toString

    /**
     * toString
     * @return String 
     */
    public String toString() {
        if (b == 0) {
            return ("" + a);
        }

        return ("(" + a + " " + b + "i" + ")");
    }

    /**
     * clone
     * @return complex 
     */
    public Complex clone() {
        try {
            return (Complex) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(" Complex Cannot be cloned. ");
            throw new RuntimeException();
        }
    }

}