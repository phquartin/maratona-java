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
        Time time1 = new Time("The Last Dance");

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        jogador3.setTime(time1);
        jogador4.setTime(time1);
        jogador5.setTime(time1);

        System.out.println(jogador1.getNome() + " | " + jogador1.getTime().getNome());

    }
}
