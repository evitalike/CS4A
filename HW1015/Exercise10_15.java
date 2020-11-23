import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise12_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.#");
        double[][] rectPoints = new double[5][2];     //create rectangle points

        System.out.print("Please enter five points: ");     //enter in five points

        for (int i = 0; i < 5; i++) {
            rectPoints[i][0] = in.nextDouble();
            rectPoints[i][1] = in.nextDouble();
        }

        MyRectangle2D boundedRectangle = getRectangle(rectPoints);  //create bounded rectangle

        System.out.println("The bounding rectangle's center (" + df.format(boundedRectangle.getX()) + ", " + df.format(boundedRectangle.getY())
                            + "), width " + df.format(boundedRectangle.getWidth()) + ", height " + df.format(boundedRectangle.getHeight()));

    }

    /**
     * getRectangle
     * @param points
     * @return MyRectangle2D
     */
    public static MyRectangle2D getRectangle(double[][] points) {
        double maxOfX = points[0][0];
        double minOfX = points[0][0];
        double maxOfY = points[0][1];    //set points from array into variables
        double minOfY = points[0][1];

        for (int i = 1; i < 5; i++) {          //loop through, find max and mins
            if (points[i][0] > maxOfX) {
                maxOfX = points[i][0];
            }
            if (points[i][0] < minOfX) {
                minOfX = points[i][0];
            }
            if (points[i][1] > maxOfY) {
                maxOfY = points[i][1];
            }
            if (points[i][1] < maxOfY) {
                minOfY = points[i][1];
            }
        }

        return new MyRectangle2D((maxOfX + minOfX) / 2, (maxOfY + minOfY) / 2, maxOfY - minOfY, maxOfX - minOfX);
    }

}