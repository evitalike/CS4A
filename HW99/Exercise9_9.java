import java.text.DecimalFormat;

public class Exercise9_9 {
    public static void main(String[] args) {

        DecimalFormat form = new DecimalFormat("##.##");
        
        // create three polygons

        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // find perimeters and areas for three polygons 

        System.out.println("Perimeter of polygon 1: " + form.format(polygon1.getPerimeter()) + "\n");
        System.out.println("Area of polygon 1: " + form.format(polygon1.getArea()) + "\n");
        
        System.out.println("Perimeter of polygon 2: " + form.format(polygon2.getPerimeter()) + "\n");
        System.out.println("Area of polygon 2: " + form.format(polygon2.getArea()) + "\n");

        System.out.println("Perimeter of polygon 3: " + form.format(polygon3.getPerimeter()) + "\n");
        System.out.println("Area of polygon 3: " + form.format(polygon3.getArea()) + "\n");
    }
    
    
}