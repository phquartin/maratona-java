package phquartin.maratonajava.javacore.Gassosiacao.exercicio.test;

import phquartin.maratonajava.javacore.Gassosiacao.exercicio.dominio.Professor;
import phquartin.maratonajava.javacore.Gassosiacao.exercicio.dominio.Seminario;
import phquartin.maratonajava.javacore.Gassosiacao.exercicio.util.InputUtil;
import phquartin.maratonajava.javacore.Gassosiacao.exercicio.dominio.Aluno;

import java.util.List;

public class ExercicioTest {
    public static void main(String[] args) {
        List<Seminario> listSeminarios;

        String[] professorArray = InputUtil.lerProfessor();
        listSeminarios = InputUtil.lerSeminario();
        Seminario[] seminarios = listSeminarios.toArray(new Seminario[0]); // [0] pois o Java vai decidir o tamanho
        Professor professor = new Professor(professorArray[0], professorArray[1], seminarios);

        InputUtil.lerAlunos(professor);

        System.out.println("Professor: "+ professor.getNome());
        for(Seminario seminario : seminarios) {
            System.out.print("\n" + seminario.getTitulo() + " - " + seminario.getLocal().getEndereco() + "\n");
            if (seminario.getAlunos() == null) {
                System.out.println("Seminario sem alunos!");
                continue;
            }
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.print(aluno.getNome() + ", " + aluno.getIdade() + " | ");
            }
        }

    }
}
