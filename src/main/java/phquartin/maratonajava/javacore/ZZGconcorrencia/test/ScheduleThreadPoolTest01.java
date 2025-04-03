package phquartin.maratonajava.javacore.ZZGconcorrencia.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPoolTest01 {
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    private static void beeper(){
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))+" beep");
        };
        //scheduler.schedule(r, 10, TimeUnit.SECONDS);
        scheduler.scheduleWithFixedDelay(r, 1,5, TimeUnit.SECONDS);

    }
    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        beeper();
    }
}
