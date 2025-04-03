package phquartin.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO = 0.21;
    public Televisao(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calculaTaxa() {
        return this.preco * IMPOSTO;
    }
}
