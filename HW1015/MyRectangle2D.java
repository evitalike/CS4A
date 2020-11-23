public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    // CONSTRUCTOR

    MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.height = 1;
        this.height = 1;
    }

    MyRectangle2D(double x, double y, double h, double w) {
        this.x = x;
        this.y = y;
        this.height = h;
        this.width = w;
    }

    // SETTERS

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // GETTERS

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    // AREA

    public double getArea() {
        return (this.height * this.width);
    }

    // PERIMETER

    public double getPerimeter() {
        return (this.height * 2 + this.width * 2);
    }

    // CONTAINS
    /**
     * contains
     * @param x
     * @param y
     * @return boolean (checks if it contains rectangle)
     */
    public boolean contains(double x, double y) {
        boolean doesContain = false;

        if (x <= (getX() + getWidth() / 2) && y <= (getY() + getHeight() / 2) && x >= getX() - (getWidth() / 2)
                && y >= getY() - (getHeight() / 2))
            ;
        {
            doesContain = true;
        }

        return doesContain;
    }

    /**
     * contains
     * @param otherRectangle
     * @return boolean (checks if it contains rectangle)
     */
    public boolean contains(MyRectangle2D otherRectangle) {
        boolean contains = false;

        if ((this.x + width / 2) >= (otherRectangle.getX() + otherRectangle.getWidth())
                && (this.x - width / 2) <= (otherRectangle.getX() - otherRectangle.getWidth())) {
            if ((this.y + height / 2) >= (otherRectangle.getY() + otherRectangle.getHeight() / 2)
                    && (this.y - height / 2) <= (otherRectangle.getY() - otherRectangle.getHeight())) {
                contains = true;
            }
        }
        return contains;
    }

    // OVERLAPS

    /**
     * overlaps
     * @param otherRectangle
     * @return boolean (check if it overlaps)
     */
    public boolean overlaps(MyRectangle2D otherRectangle) {
        double tempX = otherRectangle.x;
        double tempY = otherRectangle.y;

        double tempH = otherRectangle.height;
        double tempW = otherRectangle.width;

        if (contains(otherRectangle)) {
            return false;
        }

        if (Math.abs(x - tempX) < 0.5 * (width + tempW) && Math.abs(y - tempY) < 0.5 * (height + tempH)) {
            return true;
        }
        else
        {
            return false;
        }
    }

    

}