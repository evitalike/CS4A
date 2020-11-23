public class Rectangle extends GeometricObject {

    private double width;
    private double length;

    // CONSTRUCTORS

    Rectangle() {
        super();
    }

    Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // SETTERS

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // GETTERS

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    // area
    /**
     * calculateArea
     * @return double (area)
     */
    @Override
    public double calculateArea() {

        return (this.width * this.length);
    }

    // perimeter

    /**
     * calculatePerimeter
     * @return double (perimeter)
     */
    @Override
    public double calculatePerimeter() {
        return ((this.width * 2) * (this.length * 2));
    }
    

}