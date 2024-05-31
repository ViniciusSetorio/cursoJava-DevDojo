package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio;

public class ImpressoraFuncionarios {
    public void imprime(Funcionario funcionario) {
        System.out.println("--------(Funcionário)-------");
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Idade: " + funcionario.idade);
        System.out.println("Primeiro salário: R$" + funcionario.salario[0]);
        System.out.println("Segundo salário: R$" + funcionario.salario[1]);
        System.out.println("Terceiro salário: R$" + funcionario.salario[2]);
        System.out.println("Média salarial: R$" + funcionario.mediaSalarial);
    }
}
