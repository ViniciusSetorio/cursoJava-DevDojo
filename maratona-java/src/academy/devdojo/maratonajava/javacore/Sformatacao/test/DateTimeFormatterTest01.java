package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse1 = LocalDate.parse("20240705", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-07-05", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2024-07-05", DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2024-07-05T10:05:30.203019", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatoBR = LocalDateTime.now().format(formatterBR);
        System.out.println(formatoBR);
        LocalDate parseBR = LocalDate.parse("05/07/2024", formatterBR);
        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy");
        String formatoGR = LocalDate.now().format(formatterGR);
        System.out.println(formatoGR);
        LocalDate parseGR = LocalDate.parse("05.julho.2024", formatterGR);
        System.out.println(parseGR);

    }
}
