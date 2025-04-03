package phquartin.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeKR = Locale.KOREA;
        Locale localeUS = Locale.US;
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance(localePT);
        nf[1] = NumberFormat.getInstance(localeJP);
        nf[2] = NumberFormat.getInstance(localeKR);
        nf[3] = NumberFormat.getInstance(localeUS);
        double valor = 10_000_121.1823;
        for (NumberFormat nf1 : nf) {
            System.out.println(nf1.format(valor));
        }
    }
}
