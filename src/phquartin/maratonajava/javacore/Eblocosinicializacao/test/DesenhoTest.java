package phquartin.maratonajava.javacore.Eblocosinicializacao.test;

import phquartin.maratonajava.javacore.Eblocosinicializacao.domain.Desenho;

public class DesenhoTest {
    public static void main(String[] args) {
        Desenho desenho = new Desenho("One Piece");
        System.out.println(desenho.getNome());
        for (int episodio : desenho.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
