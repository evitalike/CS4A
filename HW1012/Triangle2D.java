public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    // CONSTRUCTORS

    Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    Triangle2D(double n1, double n2, double n3, double n4, double n5, double n6) {
        p1 = new MyPoint(n1, n2);
        p2 = new MyPoint(n3, n4);
        p3 = new MyPoint(n5, n6);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // SETTERS

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    // GETTERS

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public double getDistance(MyPoint pA, MyPoint pB) {
        double x1 = pA.getX();
        double y1 = pA.getY();
        double x2 = pB.getX();
        double y2 = pB.getY();
        return (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

    public double getArea() {

        double s1 = getDistance(this.p1, this.p2);
        double s2 = getDistance(this.p2, this.p3);
        double s3 = getDistance(this.p3, this.p1);

        double side = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(side * (side - s1) * (side - s2) * (side - s3));

        return area;
    }

    // Perimeter

    public double getPerimeter() {
        double s1 = getDistance(this.p1, this.p2);
        double s2 = getDistance(this.p2, this.p3);
        double s3 = getDistance(this.p3, this.p1);

        return (s1 + s2 + s3);
    }

    // contains point
    /**
     * containsPoint
     * @param p
     * @return boolean (if contains point)
     */
    public boolean containsPoint(MyPoint p) {
        Triangle2D t1 = new Triangle2D(this.p1, this.p2, p);
        Triangle2D t2 = new Triangle2D(this.p2, this.p2, p);
        Triangle2D t3 = new Triangle2D(this.p3, this.p1, p);

        return (t1.getArea() + t2.getArea() + t3.getArea() == this.getArea());
    }

    // contains triangle

    /**
     * contains
     * @param otherTriangle
     * @return boolean (if contains)
     */
    public boolean contains(Triangle2D otherTriangle) {
        return containsPoint(otherTriangle.getP1()) && containsPoint(otherTriangle.getP2())
                && containsPoint(otherTriangle.getP3());
    }

    // overlaps
    /**
     * overlaps
     * @param otherTriangle
     * @return boolean (if overlaps)
     */
    public boolean overlaps(Triangle2D otherTriangle) {
        boolean overlaps = false;

        double x1 = this.getP1().getX();
        double y1 = this.getP1().getY();
        double x2 = this.getP2().getX();
        double y2 = this.getP2().getY();                // assign x & y values to new variables
        double x3 = this.getP3().getX();
        double y3 = this.getP1().getY();

        double otherX1 = otherTriangle.getP1().getX();
        double otherY1 = otherTriangle.getP1().getY();
        double otherX2 = otherTriangle.getP2().getX();
        double otherY2 = otherTriangle.getP2().getY();
        double otherX3 = otherTriangle.getP3().getX();
        double otherY3 = otherTriangle.getP1().getY();

        boolean line1 = intersects(x1, y1, x2, y2, otherX1, otherY1, otherX2, otherY2);
        boolean line2 = intersects(x1, y1, x2, y2, otherX2, otherY2, otherX3, otherY3);
        boolean line3 = intersects(x1, y1, x2, y2, otherX3, otherY3, otherX1, otherY1);

        boolean line4 = intersects(x2, y2, x3, y3, otherX1, otherY1, otherX2, otherY2);   // check if lines intersect
        boolean line5 = intersects(x2, y2, x3, y3, otherX2, otherY2, otherX3, otherY3);
        boolean line6 = intersects(x2, y2, x3, y3, otherX3, otherY3, otherX1, otherY1);

        boolean line7 = intersects(x3, x3, x1, y1, otherX1, otherY1, otherX2, otherY2);
        boolean line8 = intersects(x3, x3, x1, y1, otherX2, otherY2, otherX3, otherY3);
        boolean line9 = intersects(x3, x3, x1, y1, otherX3, otherY3, otherX1, otherY1);

        if (line1 || line2 || line3 || line4 || line5 || line6 || line7 || line8) {      // if one line intersects
            overlaps = true;  // return true
        }

        return overlaps;
    }

    // intersects point

    public boolean intersects(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {

        double val = (y1 - y2) * (x3 - x4) - (x1 - x2) * (y3 - y4);

        return (val != 0);

    }
}
