import java.text.DecimalFormat;

public class Exercise10_12 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("##.####");

        // create point
        MyPoint point1 = new MyPoint(3, 3);

        // create triangle
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        
        System.out.println("Area of Triangle 1: " + df.format(t1.getArea()));
        System.out.println("Perimeter of Triangle 1: " + df.format(t1.getPerimeter()));

        String str;
        String str2;
        String str3;

        // contains point
        if(t1.containsPoint(point1)) {
            str = "Yes";
        }
        else{
            str = "No";
        }

        // contains triangle
        if(t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4)))) {
            str2 = "Yes";
        }
        else {
            str2 = "No";
        }

        // overlaps with triangle
        if( t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5)))) {
            str3 = "Yes";
        }
        else {
            str3 = "No";
        }
        
        System.out.println("\nDoes the triangle contain (3,3)? : " + str);
        System.out.println("Does the the triangle contain the points (2.9, 2), (4, 1), (1, 3.4)? : " + str2);
        System.out.println("Does the triangle overlap the points (2, 5.5), (4, -3), (2, 6.5)? : " + str3);
        


    }
}