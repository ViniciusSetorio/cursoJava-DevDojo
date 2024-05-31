package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.FuncionarioAlternativo;

public class FuncionarioTest01Alternativo {
    public static void main(String[] args) {
        FuncionarioAlternativo funcionarioAlternativo = new FuncionarioAlternativo();
        funcionarioAlternativo.setNome("Sanji");
        funcionarioAlternativo.setIdade(23);
        funcionarioAlternativo.setSalarios(new double[]{1200, 987.32, 2000});
        funcionarioAlternativo.imprime();
    }
}
