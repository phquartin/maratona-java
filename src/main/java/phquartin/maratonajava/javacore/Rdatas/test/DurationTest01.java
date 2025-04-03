package phquartin.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowTwoYears = LocalDateTime.now().plusYears(2);

        Duration duration = Duration.between(now, nowTwoYears);
        System.out.println(duration);
    }
}
