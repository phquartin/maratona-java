package phquartin.maratonajava.javacore.Aintroducaoclasses.test;

import phquartin.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor Claudio = new Professor();
        Claudio.nome = "Claudio";
        Claudio.idade = 56;
        Claudio.sexo = 'M';
        System.out.println("Nome: " + Claudio.nome+" | Idade: " + Claudio.idade + " | Sexo: " + Claudio.sexo);
    }
}
