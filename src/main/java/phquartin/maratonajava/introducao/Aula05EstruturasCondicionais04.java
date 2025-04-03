package phquartin.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Switch Exercicio
        int dia = 10;
        String mensagem;
        switch (dia){
            case 1:
                mensagem = "Domingo";
                break;
            case 2:
                mensagem = "Segunda";
                break;
            case 3:
                mensagem = "Terca";
                break;
            case 4:
                mensagem = "Quarta";
                break;
            case 5:
                mensagem = "Quinta";
                break;
            case 6:
                mensagem = "Sexta";
                break;
            case 7:
                mensagem = "Sabado";
                break;
            default:
                mensagem = "Sem dia";
                break;
        }
        System.out.println(mensagem);
    }
}
