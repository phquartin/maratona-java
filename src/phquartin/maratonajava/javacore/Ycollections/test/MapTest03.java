package phquartin.maratonajava.javacore.Ycollections.test;

import phquartin.maratonajava.javacore.Ycollections.dominio.Consumidor;
import phquartin.maratonajava.javacore.Ycollections.dominio.Smartphone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Pedro");
        Consumidor consumidor2 = new Consumidor("Maria");

        Smartphone smartphone1 = new Smartphone("1234", "Samsung");
        Smartphone smartphone2 = new Smartphone("5678", "iPhone");
        Smartphone smartphone3 = new Smartphone("9876", "Xiomi");

        Map<Consumidor, List<Smartphone>> map = new HashMap<>();

        List <Smartphone> list1 = List.of(smartphone1, smartphone2);
        List <Smartphone> list2 = List.of(smartphone2, smartphone3);

        map.put(consumidor1, list1);
        map.put(consumidor2, list2);

        for (Map.Entry<Consumidor, List<Smartphone>> entry : map.entrySet()) {
            System.out.println();
            System.out.print(entry.getKey().getNome() + " -> ");
            for (Smartphone smartphone : entry.getValue()) {
                System.out.print(smartphone.getMarca() + " ");
            }
        }

    }
}
