package phquartin.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int idade, String CPF, Endereco endereco, double salario) {
        super(nome, idade, CPF, endereco);
        this.salario = salario;
    }

    public void relatorioPagamento() {
        System.out.println("Eu, " + this.nome + ", recebi o salario de R$ " + this.salario);
    }

    @Override
    public String toString() {
        return super.toString() + ", Funcionario{" +
                "salario=" + salario +
                '}';
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
