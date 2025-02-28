package phquartin.maratonajava.javacore.Hheranca.test;

import phquartin.maratonajava.javacore.Hheranca.dominio.Endereco;
import phquartin.maratonajava.javacore.Hheranca.dominio.Funcionario;
import phquartin.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCEP("00000-000");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Davy");
        pessoa.setIdade(33);
        pessoa.setCPF("1234567890");
        pessoa.setEndereco(endereco);
        System.out.println(pessoa.toString());

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maratona");
        funcionario.setIdade(24);
        funcionario.setCPF("987654321");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000.0);
        System.out.println(funcionario.toString());
    }
}
