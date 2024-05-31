package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.ImpressoraFuncionarios;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        ImpressoraFuncionarios impressora = new ImpressoraFuncionarios();

        funcionario01.nome = "José";
        funcionario01.idade = 23;
        funcionario01.salario[0] = 2300;
        funcionario01.salario[1] = 3300;
        funcionario01.salario[2] = 4300;
        funcionario01.mediaSalarial = (funcionario01.salario[0] + funcionario01.salario[1] + funcionario01.salario[2]) / 3;

        impressora.imprime(funcionario01);
    }
}
