public class Exercise13_5 {

    public static void main(String[] args) {
        int largerThan;

        Circle circle1 = new Circle("Black", true, 12.5);               // CREATE TWO NEW CIRCLES
        Circle circle2 = new Circle("White", true, 6.5);

        Rectangle rectangle1 = new Rectangle("Black", true, 5, 3);      // TWO NEW RECTANGLES
        Rectangle rectangle2 = new Rectangle("White", true, 10,4);

        System.out.println("Circles");                                  
        Circle.max(circle1, circle2);                                   // FIND MAX OF CIRCLES

        System.out.println("Rectangles");
        GeometricObject.max(rectangle1, rectangle2);                    // FIND MAX OF RECTANGLES
    }
}