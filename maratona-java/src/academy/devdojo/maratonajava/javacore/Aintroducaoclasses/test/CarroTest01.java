package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Fusca Bala";
        carro01.modelo = "Sport";
        carro01.ano = 1969;

        carro02.nome = "Mustang";
        carro02.modelo = "GT 500";
        carro02.ano = 1968;

        System.out.println(
        "----(Meu carro)----\n" +
        "Nome: " + carro01.nome +
        "\nModelo: " + carro01.modelo +
        "\nAno: " + carro01.ano
        );

        System.out.println("----------------------------");

        System.out.println(
        "----(Meu carro 2)----\n" +
        "Nome: " + carro02.nome +
        "\nModelo: " + carro02.modelo +
        "\nAno: " + carro02.ano
        );
    }
}