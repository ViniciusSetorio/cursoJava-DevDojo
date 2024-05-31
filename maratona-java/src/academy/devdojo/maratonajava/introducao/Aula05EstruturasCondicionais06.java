package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 1;
        switch (dia) {
            case 1:
            System.out.println("Domingo - Dia não útil");
                break;
            case 2:
                System.out.println("Segunda - Dia útil");
                break;
            case 3:
            System.out.println("Terça - Dia útil");
                break;
            case 4:
                System.out.println("Quarta - Dia útil");
                break;
            case 5:
                System.out.println("Quinta - Dia útil");
                break;
            case 6:
                System.out.println("Sexta - Dia útil");
                break;
            case 7:
                System.out.println("Sábado - Dia não útil");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
