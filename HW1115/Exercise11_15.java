import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise11_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.###");

        double x[];  // create array of doubles
        double y[];  // create array of doubles
        double area;     
        int numPoints;

        System.out.print("Enter the number of the points: ");
        numPoints = in.nextInt();

        x = new double[numPoints];  // create array with numPoints
        y = new double[numPoints];  // create array with numPoints

        System.out.print("\nEnter the coordinates of the points: ");
        for (int i = 0; i < numPoints; i++) {
            x[i] = in.nextDouble();
            y[i] = in.nextDouble();
        }

        area = calculateArea(x, y, numPoints); // area

        System.out.println("The total area is " + df.format(area));

    }

    /**
     * calculateArea
     * @param xCor double[]
     * @param yCor double[]
     * @param numPoints int
     * @return double  (area)
     */
    public static double calculateArea(double[] xCor, double[] yCor, int numPoints) {

        double temp;
        double area = 0;

        // find area
        for (int i = 0; i < numPoints - 1; i++) {
            temp = (xCor[0] * (yCor[i] - yCor[i + 1]) + xCor[i] * (yCor[i + 1] - yCor[0])
                    + xCor[i + 1] * (yCor[0] - yCor[i])) / 2;

            area += Math.abs(temp);
        }

        return area;
    }
}