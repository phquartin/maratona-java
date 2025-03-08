package phquartin.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat(" dd/MMMM/yyyy");
        System.out.println(sdf.format(new Date()));
    }
}
