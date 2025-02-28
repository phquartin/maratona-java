package phquartin.maratonajava.javacore.Gassosiacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }
    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }
    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("Time: " + this.nome);
        if (this.jogadores == null) return;
        System.out.print("Jogadores: ");
        for (Jogador jogador : this.jogadores) {
            System.out.print(jogador.getNome() + " | ");
        }
    }

}
