package phquartin.maratonajava.javacore.Npolimorfismo.test;

import phquartin.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import phquartin.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import phquartin.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Dell i5", 8000);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getPreco());
        System.out.println(produto1.calculaTaxa());

        System.out.println("-----------------------------");

        Produto produto2 = new Tomate("Tomate", 3);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getPreco());
        System.out.println(produto2.calculaTaxa());

    }
}
