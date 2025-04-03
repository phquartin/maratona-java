package phquartin.maratonajava.javacore.ZZEstreams.test;

import phquartin.maratonajava.javacore.ZZEstreams.dominio.Category;
import phquartin.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest11 {
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
        Map<Category, List<LightNovel>> categoryListMap = listLightNovel.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(categoryListMap);
    }
}
