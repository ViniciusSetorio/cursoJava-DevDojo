package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    static public void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Eu ainda não tenho condições, mas vou ter";
        // operador ternário -> (condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar ;
        System.out.println(resultado);
    }
}
