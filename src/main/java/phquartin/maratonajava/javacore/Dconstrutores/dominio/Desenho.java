package phquartin.maratonajava.javacore.Dconstrutores.dominio;

public class Desenho {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;
    private String studio;

    public Desenho(String nome, String tipo, String genero, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios = episodios;
    }
    public Desenho(String nome, String tipo, String genero, int episodios, String studio) {
        this(nome, tipo, genero, episodios);
        this.studio = studio;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome + " | Tipo: " + this.tipo + " | Genero: " + this.genero +
                " | Episodios: " + this.episodios + " | Studio: " + this.studio);
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public String getTipo() {
        return this.tipo;
    }
    public int getEpisodios() {
        return this.episodios;
    }
}
