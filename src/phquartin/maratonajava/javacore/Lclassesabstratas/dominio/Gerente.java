package phquartin.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void bonusSalario() {
        this.salario = this.salario + salario * 0.2;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + this.nome + '\'' +
                ", salario=" + this.salario +
                '}';
    }
}
