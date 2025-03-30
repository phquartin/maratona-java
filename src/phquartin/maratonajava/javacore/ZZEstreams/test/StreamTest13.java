package phquartin.maratonajava.javacore.ZZEstreams.test;

import phquartin.maratonajava.javacore.ZZEstreams.dominio.Category;
import phquartin.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import phquartin.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> listLightNovel = new ArrayList<>(List.of(
            new LightNovel("Juntos Para Sempre", 29.99, Category.DRAMA),
            new LightNovel("A Queda", 59.99, Category.FANTASY),
            new LightNovel("O fim de tudo", 10.00, Category.DRAMA),
            new LightNovel("Tensei Shittara", 2.99, Category.ROMANCE),
            new LightNovel("Naruto", 3.99, Category.DRAMA),
            new LightNovel("Java", 1.99, Category.FANTASY),
            new LightNovel("Overlord", 2.45, Category.ROMANCE)
    ));
    public static void main(String[] args) {
        Map<Category, Long> collect = listLightNovel.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = listLightNovel.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                         Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = listLightNovel.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);


    }
}
