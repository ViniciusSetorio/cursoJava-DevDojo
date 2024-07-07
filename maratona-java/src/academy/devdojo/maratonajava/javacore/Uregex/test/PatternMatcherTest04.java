package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os dígitos.
        // \D = Tudo o que não for dígito.
        // \s , \t , \n , \f ou \r = Todos os espaços em brando.
        // \S = Todos os caracteres excluindo os brancos.
        // \w = Todas as letras, dígitos e "_".
        // \W = Tudo que não for incluso no \w.

        // [] = Todos os caracteres escritos dentro.

        // ? = Zero ou uma
        // * = Zero ou mais
        // + = Uma ou mais
        // {n, m} = De n até m
        // () = agrupamento
        // | = ou
        // $ = fim da linha

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
