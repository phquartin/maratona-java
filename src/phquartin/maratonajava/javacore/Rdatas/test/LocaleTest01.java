package phquartin.maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        Locale locale2 = new Locale("en", "UK");
        Calendar c = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println(df.format(c.getTime()));
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locale2);
        System.out.println(df2.format(c.getTime()));
    }
}
