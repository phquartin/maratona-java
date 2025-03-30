package phquartin.maratonajava.javacore.ZZEstreams.test;

import phquartin.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest10 {
    private static List<LightNovel> listLightNovel = new ArrayList<>(List.of(
            new LightNovel("Juntos Para Sempre", 29.99),
            new LightNovel("A Queda", 59.99),
            new LightNovel("O fim de tudo", 10.00),
            new LightNovel("Tensei Shittara", 2.99),
            new LightNovel("Naruto", 3.99),
            new LightNovel("Java", 1.99),
            new LightNovel("Overlord", 2.45)
    ));
    public static void main(String[] args) {
        DoubleSummaryStatistics collect = listLightNovel.stream()
                .collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String collected = listLightNovel.stream()
                .map(LightNovel::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(collected);

    }
}
