package phquartin.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] numerosArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numerosArray));

        List<Integer> numerosLista = new ArrayList<>(Arrays.asList(numerosArray));
        numerosLista.add(4);
        System.out.println(numerosLista);


    }
}
