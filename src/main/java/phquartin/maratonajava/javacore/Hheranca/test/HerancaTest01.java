package phquartin.maratonajava.javacore.Hheranca.test;

import phquartin.maratonajava.javacore.Hheranca.dominio.Endereco;
import phquartin.maratonajava.javacore.Hheranca.dominio.Funcionario;
import phquartin.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 1", "877123-123");
        Pessoa pessoa = new Pessoa("Pedro", 18, "12345678912", endereco);
        Funcionario funcionario = new Funcionario("Joao", 21, "1000100101", endereco, 2000);

        funcionario.relatorioPagamento();
        System.out.println(funcionario.toString());
    }
}
