package phquartin.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
    }
}
