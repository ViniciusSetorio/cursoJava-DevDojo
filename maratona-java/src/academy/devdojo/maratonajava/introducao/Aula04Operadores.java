package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero02 + numero01;
        int resultado02 = numero02 / numero01;
        double resultado02d = numero01 / (double) numero02;
        System.out.println("Resultado: " + resultado);
        System.out.println("Resultado: " + resultado02);
        System.out.println("Resultado: " + resultado02d);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isVinteMaiorQueDez = 20 > 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isVinteMaiorQueDez);

        // && (AND) || (OR) ! (NOT)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario <= 3381;
        System.out.println(isDentroDaLei);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPupanca = 10000;
        float valorPlaystation = 5000;
        boolean isValorPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPupanca > valorPlaystation;
        System.out.println(isValorPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador++;
        contador--;
        int contador02 = 0;
        ++contador;
        --contador;


    }
}
