package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos.
        // \D = Tudo o que não for dígito.
        // \s , \t , \n , \f ou \r = Todos os espaços em brando.
        // \S = Todos os caracteres excluindo os brancos.
        // \w = Todas as letras, dígitos e "_".
        // \W = Tudo que não for incluso no \w.

        String regex = "\\d";
        // String texto = "abaaba";
        String texto2 = "hhj212gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
