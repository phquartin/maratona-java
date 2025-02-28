package phquartin.maratonajava.javacore.Gassosiacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome){
        this.nome = nome;
    }

    public Time getTime() {
        return this.time;
    }
    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
