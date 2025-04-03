package phquartin.maratonajava.javacore.ZZEstreams.test;

import phquartin.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> listLightNovel = new ArrayList<>(List.of(new LightNovel("Juntos Para Sempre", 29.99),
            new LightNovel("A Queda", 59.99),
            new LightNovel("O fim de tudo", 10.00),
            new LightNovel("Tensei Shittara", 2.99),
            new LightNovel("Naruto", 3.99),
            new LightNovel("Java", 1.99),
            new LightNovel("Overlord", 2.45)
    ));
    public static void main(String[] args) {
        listLightNovel.sort(Comparator.comparing(LightNovel::getTitle));
        listLightNovel.forEach(System.out::println);

        List<String> osTresMenoresPrecos = new ArrayList<>();
        for (LightNovel lightNovel : listLightNovel) {
            if (lightNovel.getPrice() <= 4) {
                osTresMenoresPrecos.add(lightNovel.getTitle());
            }
            if (osTresMenoresPrecos.size() == 3){
                break;
            }
        }
        osTresMenoresPrecos.forEach(System.out::println);
    }
}
