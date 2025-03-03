package phquartin.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + this.nome + '\'' +
                ", salario=" + this.salario +
                '}';
    }

    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
}
