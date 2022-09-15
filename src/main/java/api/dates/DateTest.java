package api.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTest {
    public static void main(String[] args) {
        Date cal =  Calendar.getInstance(Locale.UK).getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");


        Calendar gc = new GregorianCalendar();
        SimpleDateFormat clone = (SimpleDateFormat)sdf2.clone();

        System.out.println(clone.getClass().getCanonicalName());
        System.out.println(sdf.format(cal));
        System.out.println(clone.format(cal));
        System.out.println(clone.format(gc.getTime()));
    }
}
