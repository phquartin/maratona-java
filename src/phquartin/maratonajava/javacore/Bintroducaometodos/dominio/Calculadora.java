package phquartin.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public double soma(double[] vetor) {
        double numerosSomados = 0;
        for (double num : vetor) {
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

    public int multiplicacao(int... vetor) {
        int numerosMultiplicados = 1;
        for (int num : vetor) {
            numerosMultiplicados *= num;
        }
        return numerosMultiplicados;
    }

}
