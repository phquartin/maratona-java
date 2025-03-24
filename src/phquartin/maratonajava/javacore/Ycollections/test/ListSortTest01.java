package phquartin.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(10);
        lista.add(5);
        lista.add(2);
        lista.add(1000);
        lista.add(-10);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
