package phquartin.maratonajava.javacore.ZZEstreams.test;

import phquartin.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03
{
    private static List<LightNovel> listLightNovel = new ArrayList<>(List.of(new LightNovel("Juntos Para Sempre", 29.99),
            new LightNovel("A Queda", 59.99),
            new LightNovel("O fim de tudo", 10.00),
            new LightNovel("Tensei Shittara", 2.99),
            new LightNovel("Naruto", 3.99),
            new LightNovel("Java", 1.99),
            new LightNovel("Overlord", 2.45)
    ));
    public static void main(String[] args) {
        Stream<LightNovel> stream = listLightNovel.stream();
        long count = stream.filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println(count);
    }
}
