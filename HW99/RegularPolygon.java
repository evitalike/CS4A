
class RegularPolygon {
    // VARIABLES
    private int n;
    private double side;
    private double x;
    private double y;

    //CONSTRUCTORS
    RegularPolygon(){
        setN(3);
        setSide(1);
        setX(0);
        setY(0); 
    }

    RegularPolygon(int num, double s){
        setN(num);
        setSide(s);
        setX(0);
        setY(0); 
    }

    RegularPolygon(int num, double s, double xCor, double yCor){
        setN(num);
        setSide(s);
        setX(xCor);
        setY(yCor); 
    }

    // SETTERS
    public void setN(int num){
        n = num;
    }

    public void setSide(double s){
        side = s;
    }

    public void setX(double xCor){
        x = xCor;
    }

    public void setY(double yCor){
        y = yCor;
    }

    //GETTERS
    public int getN(){
        return n;
    }

    public double getSide(){
        return side;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    //Perimeter

    /**
     * getPerimeter
     * @return double perimeter
     */

    public double getPerimeter(){
        return(getN() * getSide());
    }

    //Area

    /**
     * getArea
     * @return double area
     */

    public double getArea(){
        return((getN() * Math.pow(2, getSide())) / (4 * Math.tan(Math.PI / getN())));
    }
}