import java.text.DecimalFormat;

public class Exercise10_4 {
    public static void main(String[] args) {

        DecimalFormat form = new DecimalFormat("##.##");

        MyPoint point1 = new MyPoint();           //
        MyPoint point2 = new MyPoint(10, 30.5);   // Create two points

        System.out.println("The distance between point 1 and point 2 is: " + form.format(point2.distance(point1)));
    }
} 