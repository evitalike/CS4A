class MyPoint {
    private double x;
    private double y;

    // CONSTRUCTORS

    MyPoint() {
        setX(0);
        setY(0);
    }

    MyPoint(double n1, double n2) {
        setX(n1);
        setY(n2);
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

    // DISTANCE

    /**
     * distance (gets distance between two points)
     * @param n1 first point
     * @param n2 second point
     * @return distance
     */

    public double distance(double n1, double n2) {
        return (Math.sqrt(((getX() - n1) * (getX() - n1)) + ((getY() - n2) * (getY() - n2))));
    }

    /**
     * distance
     * @param point (object point)
     * @return double 
     */

    public double distance(MyPoint point) {
        return(distance(point.getX(), point.getY()));
    }

    
}