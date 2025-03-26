package phquartin.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato(), new Gato());
        List<Animal> animais = new ArrayList<>(List.of(new Gato(), new Cachorro()));
        consulta(cachorros);
        consulta(gatos);
        consulta(animais);
        escrita(animais);
        consulta(animais);

    }
    // Apenas leitura
    private static void consulta(List<? extends Animal> animal) {
        for (Animal a : animal) {
            a.consulta();
        }
        System.out.println("------------------");
    }

    // Pode escrever
    private static void escrita(List<? super Animal> animais) {
        animais.add(new Gato());
        animais.add(new Cachorro());
    }

}
