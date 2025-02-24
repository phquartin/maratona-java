package phquartin.maratonajava.javacore.Bintroducaometodos.test;

import phquartin.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import phquartin.maratonajava.javacore.Bintroducaometodos.dominio.EstudanteCalcular;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        EstudanteCalcular calc = new EstudanteCalcular();
        estudante.notas = new double[] {9, 10, 9};
        estudante.idade = 18;
        estudante.nome = "Joao";

        double media = calc.calcularMedia(estudante);
        System.out.println(media);

        calc.mudarNome(estudante);
        System.out.println(estudante.nome);
    }
}
