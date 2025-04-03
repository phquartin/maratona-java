package phquartin.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArray(10.0F);
    }
    private static <T> void criarArray(T t) {
        List<T> lista = new ArrayList<>(List.of(t));
        System.out.println(lista);
        System.out.println(t.getClass());
    }
}
