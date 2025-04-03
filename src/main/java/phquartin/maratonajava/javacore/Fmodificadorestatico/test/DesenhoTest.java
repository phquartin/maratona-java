package phquartin.maratonajava.javacore.Fmodificadorestatico.test;

import phquartin.maratonajava.javacore.Fmodificadorestatico.dominio.Desenho;

public class DesenhoTest {
    public static void main(String[] args) {
        Desenho desenho1 = new Desenho("Up");
        Desenho desenho2 = new Desenho("SuperMan");
        Desenho desenho3 = new Desenho("Branca de Neve");
        for(int episodio : Desenho.getEpisodios()){
            System.out.println(episodio);
        }
    }
}
