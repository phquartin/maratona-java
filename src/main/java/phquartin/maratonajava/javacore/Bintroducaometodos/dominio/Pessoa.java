package phquartin.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Idade negativa, tente novamente!");
            return;
        }
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
