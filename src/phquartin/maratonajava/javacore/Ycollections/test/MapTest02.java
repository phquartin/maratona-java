package phquartin.maratonajava.javacore.Ycollections.test;

import phquartin.maratonajava.javacore.Ycollections.dominio.Consumidor;
import phquartin.maratonajava.javacore.Ycollections.dominio.Smartphone;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Pedro");
        Consumidor consumidor2 = new Consumidor("Maria");

        Smartphone smartphone1 = new Smartphone("1234", "Samsung");
        Smartphone smartphone2 = new Smartphone("5678", "iPhone");
        Smartphone smartphone3 = new Smartphone("9876", "Xiomi");

        Map<Consumidor, Smartphone> map = new HashMap<>();

        map.put(consumidor1, smartphone1);
        map.put(consumidor2, smartphone2);

        for (Map.Entry<Consumidor, Smartphone> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome() + " " + entry.getValue().getMarca());
        }

    }
}
