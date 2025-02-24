package phquartin.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public int soma(int[] vetor) {
        int numerosSomados = 0;
        for (int num : vetor) {
            numerosSomados = numerosSomados + num;
        }
        return numerosSomados;
    }

    public int subtracao(int[] vetor) {
        int numerosSubtraidos = 0;
        for (int num : vetor) {
            numerosSubtraidos = numerosSubtraidos - num;
        }
        return numerosSubtraidos;
    }

}
