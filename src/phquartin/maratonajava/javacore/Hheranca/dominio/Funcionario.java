package phquartin.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

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
