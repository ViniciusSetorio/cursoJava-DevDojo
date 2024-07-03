package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numberFormats = new NumberFormat[3];
        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 1000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "R$ 1.000,21";
        try {
            System.out.println(numberFormats[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
