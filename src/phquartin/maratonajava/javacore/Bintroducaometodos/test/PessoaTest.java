package phquartin.maratonajava.javacore.Bintroducaometodos.test;

import phquartin.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(10);
        pessoa.setNome("Pedro");
        pessoa.imprimir();
    }
}
