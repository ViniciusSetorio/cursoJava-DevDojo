package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1719577741483L);
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
