package phquartin.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Desenho {
    private String nome;
    private static int[] episodios;
    static {
        episodios = new int[1000];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Desenho(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static int[] getEpisodios() {
        return Desenho.episodios;
    }
}
