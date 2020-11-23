public class Circle extends GeometricObject {
    double radius;

    Circle(){
        super();
    }

    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    // SETTER

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // GETTER

    public double getRadius() {
        return radius;
    }

    // AREA

    @Override
    public double calculateArea() {
        return(Math.PI * Math.pow(radius, 2));
    }

    // PERIMETER 

    @Override
	public double calculatePerimeter() {
        return(2 * Math.PI * radius);
    }
    
}