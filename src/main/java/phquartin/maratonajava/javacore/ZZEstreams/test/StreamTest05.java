package phquartin.maratonajava.javacore.ZZEstreams.test;

import phquartin.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest05 {
    private static List<LightNovel> listLightNovel = new ArrayList<>(List.of(new LightNovel("Juntos Para Sempre", 29.99),
            new LightNovel("A Queda", 59.99),
            new LightNovel("O fim de tudo", 10.00),
            new LightNovel("Tensei Shittara", 2.99),
            new LightNovel("Naruto", 3.99),
            new LightNovel("Naruto 2", 10.99),
            new LightNovel("Java", 1.99),
            new LightNovel("Overlord", 2.45)
    ));
    public static void main(String[] args) {
        boolean b = listLightNovel.stream()
                .anyMatch(ln -> ln.getTitle().contains("Naruto"));
        System.out.println(b);
        boolean b1 = listLightNovel.stream()
                .allMatch(ln -> ln.getPrice() > 0);
        System.out.println(b1);
        boolean b2 = listLightNovel.stream()
                .noneMatch(ln -> ln.getPrice() > 0);
        System.out.println(b2);
        listLightNovel.stream().filter(ln -> ln.getPrice() > 1)
                .findAny()
                .ifPresent(System.out::println);
        listLightNovel.stream().filter(ln -> ln.getPrice() < 2)
                .min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
