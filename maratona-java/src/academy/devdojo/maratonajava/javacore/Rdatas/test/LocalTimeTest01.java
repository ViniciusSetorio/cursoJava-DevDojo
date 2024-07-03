package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(localTime);
        System.out.println(timeNow);
        System.out.println(timeNow.getHour());
        System.out.println(timeNow.getMinute());
        System.out.println(timeNow.getSecond());
        System.out.println(ChronoField.CLOCK_HOUR_OF_AMPM);
        System.out.println(localTime.MIN);
        System.out.println(localTime.MAX);
    }
}