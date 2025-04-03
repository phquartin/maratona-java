package phquartin.maratonajava.javacore.ZZClambdas.test;

import phquartin.maratonajava.javacore.ZZClambdas.dominio.Anime;
import phquartin.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
        System.out.println(anime);
        anime.sort(AnimeComparators::compareByTitle);
        System.out.println(anime);
        System.out.println("---------------------------");
        anime.sort(AnimeComparators::compareByEpisodes);
        anime.reversed().forEach(System.out::println);
    }
}
