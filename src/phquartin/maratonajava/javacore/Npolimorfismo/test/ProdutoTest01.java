package phquartin.maratonajava.javacore.Npolimorfismo.test;

import phquartin.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import phquartin.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import phquartin.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import phquartin.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell", 6000);
        Tomate tomate = new Tomate("Tomate", 3);
        tomate.setDataValidade("12/01/2026");
        Televisao televisao = new Televisao("Televisao", 300);

        CalculadoraImposto.calculaTaxa(computador);
        System.out.println("---------------------------");
        CalculadoraImposto.calculaTaxa(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calculaTaxa(televisao);

    }
}
