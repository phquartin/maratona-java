package phquartin.maratonajava.javacore.Lclassesabstratas.test;

import phquartin.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import phquartin.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 5000);
        gerente.bonusSalario();
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Toyota", 10000);
        desenvolvedor.bonusSalario();
        System.out.println(desenvolvedor);
    }
}
