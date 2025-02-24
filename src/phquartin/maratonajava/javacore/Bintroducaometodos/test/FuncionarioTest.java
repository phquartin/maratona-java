package phquartin.maratonajava.javacore.Bintroducaometodos.test;

import phquartin.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Maratona";
        funcionario.idade = 20;
        funcionario.salario = new double[]{1500, 2000, 2500};
        funcionario.imprimir();
        double media = funcionario.mediaSalario();
        System.out.println(media);
    }
}
