package phquartin.maratonajava.javacore.ZZEstreams.test;

import phquartin.maratonajava.javacore.ZZEstreams.dominio.Category;
import phquartin.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import phquartin.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
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
        Map<Category, DoubleSummaryStatistics> collect = listLightNovel.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        collect.forEach((category, summaryStatistics) -> {
            System.out.println(category + ": " + summaryStatistics);
        });
        System.out.println();
        Map<Category, Set<Promotion>> collect1 = listLightNovel.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                         Collectors.mapping(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE, Collectors.toSet())));
        System.out.println(collect1);
    }
}
