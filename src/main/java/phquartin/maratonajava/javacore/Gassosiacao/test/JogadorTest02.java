package phquartin.maratonajava.javacore.Gassosiacao.test;

import phquartin.maratonajava.javacore.Gassosiacao.dominio.Jogador;
import phquartin.maratonajava.javacore.Gassosiacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Fallen");
        Jogador jogador2 = new Jogador("FerGOD");
        Jogador jogador3 = new Jogador("FNX");
        Jogador jogador4 = new Jogador("Boltz");
        Jogador jogador5 = new Jogador("Coldzera");

        Jogador[] jogadores = {jogador1, jogador2, jogador3, jogador4, jogador5};

        Time time1 = new Time("The Last Dance", jogadores);

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        jogador3.setTime(time1);
        jogador4.setTime(time1);
        jogador5.setTime(time1);

        time1.imprimir();
        System.out.println("\n" + jogador1.getNome() + " -> " + jogador1.getTime().getNome());
        System.out.println(jogador2.getNome() + " -> " + jogador2.getTime().getNome());
        System.out.println(time1.getNome());

    }
}
