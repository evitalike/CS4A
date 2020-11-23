public class MyPoint {

    // variables
    private double x;
    private double y;

    // CONSTRUCTORS

    MyPoint() {
        this.x = 0.0;
        this.y = 0.0;
    }

    MyPoint(double n1, double n2) {
        this.x = n1;
        this.y = n2;
    }

    // SETTERS

    public void setX(double n) {
        x = n;
    }

    public void setY(double n) {
        y = n;
    }

    // GETTERS
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
