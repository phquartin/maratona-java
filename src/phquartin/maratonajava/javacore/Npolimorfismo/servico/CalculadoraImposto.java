package phquartin.maratonajava.javacore.Npolimorfismo.servico;

import phquartin.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import phquartin.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calculaTaxa(Produto produto) {
        double imposto = produto.calculaTaxa();
        System.out.println("Imposto do produto: " + produto.getNome() + " = " + imposto + "\n" +
                "Valor Final = " + (imposto + produto.getPreco()));
        if (produto instanceof Tomate){
            System.out.println(((Tomate) produto).getDataValidade());
        }
    }

}
