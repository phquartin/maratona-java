package phquartin.maratonajava.javacore.Bintroducaometodos.dominio;


public class EstudanteCalcular {
    public double calcularMedia(Estudante estudante){
        Calculadora calc = new Calculadora();
        int qtdProvas = estudante.notas.length;
        return calc.soma(estudante.notas) / qtdProvas;
    }
    public void mudarNome(Estudante estudante){
        estudante.nome = "Pedro";
        return;
    }
}
