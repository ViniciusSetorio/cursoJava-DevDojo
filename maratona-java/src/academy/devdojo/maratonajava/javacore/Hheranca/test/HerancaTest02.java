package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - O bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai.
    // 1 - O bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha.
    // 2 - É alocado um espaço em memória para o objeto da super classe.
    // 3 - Cada atributo de super classe é criado e inicializado com valores default ou o que for passado.
    // 4 - O bloco de inicialização da super classe é executado na ordem em que aparece.
    // 5 - O construtor da super classe é executado.
    // 6 - É alocado um espaço em memória para o objeto da sub classe.
    // 7 - Cada atributo de sub classe é criado e inicializado com valores default ou o que for passado.
    // 8 - O bloco de inicialização da sub classe é executado na ordem em que aparece.
    // 9 - O construtor da sub classe é executado.
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
