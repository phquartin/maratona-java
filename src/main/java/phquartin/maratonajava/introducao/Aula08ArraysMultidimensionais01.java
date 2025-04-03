package phquartin.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        int[][] notasAlunos = new int[3][3];
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 10;
        notasAlunos[0][2] = 10;
        notasAlunos[1][0] = 3;
        notasAlunos[1][1] = 7;
        notasAlunos[1][2] = 5;
        notasAlunos[2][0] = 9;
        notasAlunos[2][1] = 6;
        notasAlunos[2][2] = 7;

        for (int[] Aluno : notasAlunos) {
            for (int nota : Aluno) {
                System.out.print(nota + ", ");
            }
            System.out.println(" ");
        }
    }
}
