public class Exercise10_14 {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();                       // create new date
        MyDate date2 = new MyDate(561555550000L);          // create new date

        // output
        System.out.println("MM/DD/YYYY for date 1: " + date1.getMonth() + "\\" + date1.getDay() + "\\" + date1.getYear());
        System.out.println("MM/DD/YYYY for date 2: " + date2.getMonth() + "\\" + date2.getDay() + "\\" + date2.getYear());

    }
}