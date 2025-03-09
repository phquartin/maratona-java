package phquartin.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowTwoYears = LocalDate.now().plusYears(2).plusDays(2);
        Period period = Period.between(now, nowTwoYears);
        System.out.println(period);
    }
}
