public class Exercise13_6 {

    public static void main(String[] args) {
        int largerThan;

        Circle circle1 = new Circle("Black", true, 12.5);
        Circle circle2 = new Circle("White", true, 6.5);

        Rectangle rectangle1 = new Rectangle("Black", true, 5, 3);
        Rectangle rectangle2 = new Rectangle("White", true, 10,4);

        System.out.println("Circles");
        GeometricObject.max(circle1, circle2);
        
        System.out.println("Rectangles");
        GeometricObject.max(rectangle1, rectangle2);
    }
}