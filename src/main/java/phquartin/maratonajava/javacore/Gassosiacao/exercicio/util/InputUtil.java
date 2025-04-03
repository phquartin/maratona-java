package phquartin.maratonajava.javacore.Gassosiacao.exercicio.util;

import phquartin.maratonajava.javacore.Gassosiacao.exercicio.dominio.Aluno;
import phquartin.maratonajava.javacore.Gassosiacao.exercicio.dominio.Local;
import phquartin.maratonajava.javacore.Gassosiacao.exercicio.dominio.Professor;
import phquartin.maratonajava.javacore.Gassosiacao.exercicio.dominio.Seminario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputUtil {
    static Scanner sc = new Scanner(System.in);

    public static String[] lerProfessor() {
        System.out.print("Digite seu nome professor: ");
        String professorNome =  sc.nextLine();
        System.out.print("Digite sua especialidade: ");
        String especialidade = sc.nextLine();
        return new String[]{professorNome, especialidade};
    }

    public static String lerLocal(String seminario) {
        System.out.print("Digite o endereco do local do seminario: ");
        String local = sc.nextLine();
        System.out.print("Confirma o local " + local + " do seminario "+seminario+"?(S/N): ");
        char resposta = sc.next().charAt(0);
        if (resposta == 's' || resposta == 'S') {return local;}
        return lerLocal(seminario);
    }

    public static List<Seminario> lerSeminario() {
        List<Seminario> seminarios = new ArrayList<>();
        int count = 0;
        while(true){
            System.out.print("Digite o nome do seu seminario: ");
            String seminarioNome =  sc.nextLine();
            String endereco = lerLocal(seminarioNome);
            Local local = new Local(endereco);
            seminarios.add(new Seminario(seminarioNome, local));
            System.out.println("Seminario cadastrado com sucesso!");
            System.out.println("Voce possui " + ++count + " seminario(s)");
            System.out.println("Deseja adicionar mais? S/N");
            char resposta = sc.next().charAt(0);
            sc.nextLine();
            if(resposta == 'S' || resposta == 's') {
                continue;
            }
            return seminarios;
        }
    }

    public static void lerAlunos(Professor professor) {
        int count = 0;
        List<Aluno> listaAlunos = new ArrayList<>();
        System.out.println("\t\tCadastre Alunos no Seminario");
        System.out.println("Selecione o seminario: ");
        int countSemi = 0;
        for(Seminario seminario : professor.getSeminarios()) {
            ++countSemi;
            if (seminario.getAlunos() != null) {continue;}
            System.out.println(countSemi + " - " + seminario.getTitulo() + " | " + seminario.getLocal().getEndereco());
        }
        System.out.println("0 - Sair");
        System.out.print("Qual o seminario voce quer adicionar alunos?: ");
        int opcao = sc.nextInt();
        if (opcao == 0) {return;}
        if (opcao < 0 || opcao > countSemi) {
            System.out.println("Seminario invalido!");
            lerAlunos(professor);
            return;
        }
        sc.nextLine();
        opcao = opcao - 1;
        while(true) {
            System.out.print("Aluno " + ++count + "\nNome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            listaAlunos.add(new Aluno(nome, idade, professor.getSeminarios()[opcao]));

            System.out.println("Alunos cadastrados com sucesso!");
            System.out.println("Voce possui " + count + " alunos cadastrado(s)");
            System.out.println("Deseja contunuar? S/N");
            char resposta = sc.next().charAt(0);
            sc.nextLine();
            if (resposta == 'S' || resposta == 's') {
                continue;
            }
            Aluno[] alunos = listaAlunos.toArray(new Aluno[0]);
            professor.getSeminarios()[opcao].setAlunos(alunos);
            for (Seminario seminario : professor.getSeminarios()) {
                if (seminario.getAlunos() != null) {
                    continue;
                }
                lerAlunos(professor);
            }
            return;
        }
    }
}
