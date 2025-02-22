package phquartin.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        double salario = 1000;
        String mensagemNaoDoar = "Infelizmente nao tenho dinheiro agora, mas vou ter!";
        String mensagemDoar = "Tenho dinheiro, vou doar!";
        // X = (condicao) ? verdadeiro : falso
        String resultado = (salario >= 1000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
