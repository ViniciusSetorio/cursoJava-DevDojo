package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionas01 {
    public static void main(String [] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida");
        } else {
            System.out.println("Não autorizado a comprar bebida");
        }
        System.out.println("Fora do if");

    }
}
