package phquartin.maratonajava.javacore.ZZClambdas.test;

import phquartin.maratonajava.javacore.ZZClambdas.dominio.Anime;
import phquartin.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
        anime.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(anime);
    }
}
