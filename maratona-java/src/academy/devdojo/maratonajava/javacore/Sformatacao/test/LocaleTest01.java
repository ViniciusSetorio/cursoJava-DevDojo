package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat dateFormat5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italia: " + dateFormat1.format(calendar.getTime()));
        System.out.println("Suíça: " + dateFormat2.format(calendar.getTime()));
        System.out.println("India: " + dateFormat3.format(calendar.getTime()));
        System.out.println("Japão: " + dateFormat4.format(calendar.getTime()));
        System.out.println("Holanda: " + dateFormat5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());
    }
}
