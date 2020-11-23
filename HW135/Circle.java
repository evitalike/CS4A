public class Circle extends GeometricObject {
    double radius;

    // CONSTRUCTORS

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

    /**
     * calculateArea
     * @return double (area)
     */
    @Override
    public double calculateArea() {
        return(Math.PI * Math.pow(radius, 2));
    }

    // PERIMETER 

    /**
     * calculatePerimeter
     * @return double (perimeter)
     */
    @Override
	public double calculatePerimeter() {
        return(2 * Math.PI * radius);
    }
    
}