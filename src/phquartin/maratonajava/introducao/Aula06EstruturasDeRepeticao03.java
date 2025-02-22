package phquartin.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Dado um valor de um carro, descubra quantas vezes ele pode ser parcelado, sendo que o valor minimo da parcela eh 1000, usando Estruturas de Rep.
    public static void main(String[] args) {
        double valorCarro = 56999;
        int valorMinimoParcelas = 1000;
        int parcelas = 0;

        while (valorCarro >= valorMinimoParcelas) {
            valorCarro -= valorMinimoParcelas;
            parcelas++;
        }
        System.out.println(parcelas);
    }
}
