public class Square extends GeometricObject implements Colorable{

    double side;

    // CONSTRUCTOR

    Square(){
        super();
    }

    Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    // SETTER

    public void setSide(double side) {
        this.side = side;
    }

    // GETTER

    public double getSide() {
        return side;
    }
    
    }
    @Override
    public double calculateArea() {
        return(Math.pow(side, 2));
    }

    @Override
    public double calculatePerimeter() {
        return(side + side + side + side);
    }

    /**
     * howToColor()
     * - outputs a message
     */

    @Override
    public void howToColor() {
        System.out.println("Color all four sides\n");
    }
    
}