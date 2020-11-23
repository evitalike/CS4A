import java.util.GregorianCalendar;
import java.util.Calendar;


public class MyDate {

    private int year;
    private int month;
    private int day;

    // CONSTRUCTORS

    public MyDate() {

        GregorianCalendar calender = new GregorianCalendar();
        
        setYear(calender.get(GregorianCalendar.YEAR));
        setMonth((calender.get(GregorianCalendar.MONTH))+1);
        setDay(calender.get(GregorianCalendar.DAY_OF_MONTH));

    }

    public MyDate(long elapsedTime){

        GregorianCalendar calender = new GregorianCalendar();
        GregorianCalendar elapse   = new GregorianCalendar(1970, 0, 1);

        calender.setTimeInMillis(elapse.getTimeInMillis() + elapsedTime);

        setYear(calender.get(GregorianCalendar.YEAR));
        setMonth(calender.get(GregorianCalendar.MONTH));
        setDay(calender.get(GregorianCalendar.DAY_OF_MONTH));
    }

    public MyDate(int y, int m, int d){

        setYear(y);
        setMonth(m);
        setDay(d);
    }

    // SETTERS

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // GETTERS

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // SET DATE

    /**
     * setDate
     * @param elapsedTime long (time passed)
     */
    public void setDate(long elapsedTime){

        GregorianCalendar calender = new GregorianCalendar();
        calender.setTimeInMillis(elapsedTime);
        setYear(calender.get(GregorianCalendar.YEAR));
        setMonth(calender.get(GregorianCalendar.MONTH));
        setDay(calender.get(GregorianCalendar.DAY_OF_MONTH));

    }






}