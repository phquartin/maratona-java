package phquartin.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO = 0.21;
    private String dataValidade;
    public Tomate(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calculaTaxa() {
        return this.preco * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
