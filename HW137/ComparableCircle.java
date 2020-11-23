public class ComparableCircle extends Circle implements Comparable {

    @Override
    public int compareTo(Object obj) {
        if (this.calculateArea() > ((Circle)obj).calculateArea()) {
            return 1;
        } else if (this.calculateArea() < ((Circle)obj).calculateArea()) {
            return 0;
        } else {
            return -1;
        }
    }

}