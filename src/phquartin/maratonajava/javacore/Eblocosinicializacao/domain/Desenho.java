package phquartin.maratonajava.javacore.Eblocosinicializacao.domain;

public class Desenho {
    private String nome;
    private int[] episodios;
    {
        episodios = new int[1000];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Desenho(String nome) {
        this.nome = nome;
        this.episodios = this.getEpisodios();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
