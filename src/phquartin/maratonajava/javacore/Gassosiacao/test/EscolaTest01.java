package phquartin.maratonajava.javacore.Gassosiacao.test;

import phquartin.maratonajava.javacore.Gassosiacao.dominio.Escola;
import phquartin.maratonajava.javacore.Gassosiacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Jiraya");
        Professor professor02 = new Professor("Felippe");
        Professor[] professores = {professor01, professor02};

        Escola escola = new Escola("Marista", professores);

        System.out.println("Escola: " + escola.getNome());

        System.out.print("Professores: ");
        for (Professor professor : professores) {
            System.out.print(professor.getNome() + " ");
        }
    }
}
