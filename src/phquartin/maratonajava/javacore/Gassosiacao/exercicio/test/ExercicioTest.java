package phquartin.maratonajava.javacore.Gassosiacao.exercicio.test;

import phquartin.maratonajava.javacore.Gassosiacao.exercicio.dominio.Aluno;
import phquartin.maratonajava.javacore.Gassosiacao.exercicio.dominio.Local;
import phquartin.maratonajava.javacore.Gassosiacao.exercicio.dominio.Professor;
import phquartin.maratonajava.javacore.Gassosiacao.exercicio.dominio.Seminario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        List<Seminario> seminarios = new ArrayList<>();
        int count = 0;
        int countSemi;
        Local local1 = new Local("Sala01");
        Local local2 = new Local("Sala02");
        Local local3 = new Local("Sala03");

        System.out.print("Digite seu nome professor: ");
        String professorNome =  sc.nextLine();
        System.out.print("Digite sua especialidade: ");
        String especialidade = sc.nextLine();

        while(true){
            System.out.print("Digite o nome do seu seminario "+ ++count +": ");
            String seminarioNome =  sc.nextLine();
            System.out.println("Qual vai ser o local?\n1 - Sala 01 \n2 - Sala02\n3 - Sala03");
            int opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    seminarios.add(new Seminario(seminarioNome, local1));
                    break;
                case 2:
                    seminarios.add(new Seminario(seminarioNome, local2));
                    break;
                case 3:
                    seminarios.add(new Seminario(seminarioNome, local3));
                    break;
                default:
                    System.out.println("Local INVALIDO");
            }
            System.out.println("Seminario cadastrado com sucesso!");
            System.out.println("Voce possui " + count + " seminario(s)");
            System.out.println("Deseja contunuar? S/N");
            char resposta = sc.next().charAt(0);
            sc.nextLine();
            if(resposta == 'S' || resposta == 's') {
                continue;
            }
            break;
        }

        Seminario[] arraySeminarios = seminarios.toArray(new Seminario[0]);
        Professor professor = new Professor(professorNome, especialidade, arraySeminarios);

        count = 0;
        System.out.println("\t\tCadastre Alunos no Seminario");
        while(true) {

            System.out.println("Selecione o seminario: ");
            countSemi = 0;
            for(Seminario seminario : arraySeminarios) {
                System.out.println(++countSemi + " - " + seminario.getTitulo() + " | " + seminario.getLocal());
            }
            System.out.print("Qual o seminario voce quer adicionar alunos?: ");
            int opcao = sc.nextInt();
            while(true) {
                System.out.print("Aluno " + ++count + "\nNome: ");
                String nome = sc.nextLine();
                System.out.print("Idade: ");
                int idade = sc.nextInt();

                alunos.add(new Aluno(nome, idade));

                System.out.println("Alunos cadastrados com sucesso!");
                System.out.println("Voce possui " + count + " alunos cadastrado(s)");
                System.out.println("Deseja contunuar? S/N");
                char resposta = sc.next().charAt(0);
                sc.nextLine();
                if (resposta == 'S' || resposta == 's') {
                    continue;
                }
                break;
            }
        }


    }
}
