package phquartin.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public boolean imprimir(){
        if (salario == null || nome == null || idade == 0) {
            return false;
        }
        System.out.println("Nome: " + this.nome + " | Idade: " + this.idade +
                " | Salarios: R$ " + this.salario[0] + " , R$ " + this.salario[1] + " , R$ " + this.salario[2]);
        return true;
    }
    public double mediaSalario() {
        if (salario == null) {return 0;}
        Calculadora calc = new Calculadora();
        double soma = calc.soma(salario);
        return soma / this.salario.length;
    }
}
