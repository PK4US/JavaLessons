package Section_5.Lesson5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Lesson5 {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTimeInMillis());
        calendar.set(1999,7,16,19,0,0);
        System.out.println(calendar.getTimeInMillis());
        calendar.set(GregorianCalendar.YEAR,2020);
        calendar.set(GregorianCalendar.MONTH,10);
        calendar.set(GregorianCalendar.DAY_OF_MONTH,5);
        calendar.set(GregorianCalendar.HOUR,22);
        calendar.set(GregorianCalendar.MINUTE,15);
        calendar.set(GregorianCalendar.SECOND,55);
        System.out.println(calendar.get(GregorianCalendar.YEAR));

        String date = "15.12.2025 12:25:10";
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        d = format.parse(date);
        calendar.setTime(d);
        System.out.println(calendar.getTime());
        System.out.println((new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).format(d));
    }
}