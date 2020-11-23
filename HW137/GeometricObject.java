

public abstract class GeometricObject implements Comparable {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    private double area;

    GeometricObject() {
        dateCreated = new java.util.Date();
    }

    GeometricObject(String color, boolean filled) {
        this();
        this.color = color;
        this.filled = filled;
    }

    // GETTERS

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    // SETTERS

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // calculate the area

    public abstract double calculateArea();

    // get perimeter

    public abstract double calculatePerimeter();

    // toString

    @Override
    public String toString() {
        String str = (this.isFilled() ? "yes" : "no");
        return ("\nColor: " + this.color + "\nFilled: " + str + "\nDate Created: " + this.dateCreated);
    }

    // compareTo

    @Override
    public int compareTo(Object obj){
        if(this.calculateArea() > ((GeometricObject)obj).calculateArea()) {
            return 1;
        }
        else if(this.calculateArea() == ((GeometricObject)obj).calculateArea()) {
            return 0;
        }
        else {
            return -1;
        }
    }

    // max

    public static GeometricObject max(GeometricObject obj, GeometricObject obj2) {
        int larger = obj.compareTo(obj2);

        if (larger > 0) {
            System.out.println(obj + " is larger than " + obj2);
            return obj;
        } else if (larger < 0) {
            System.out.println(obj + " is smaller than " + obj2);
            return obj2;
        } else {
            System.out.println(obj + " is the same size as " + obj2);
            return obj;
        }

    }

}

