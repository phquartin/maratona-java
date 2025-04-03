package phquartin.maratonajava.javacore.ZZDoptional.repositorio;

import phquartin.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga("Boku no Hero", 50), new Manga("OverLord", 25));


    public static Optional<Manga> findById(Integer id) {return findManga(m -> m.getId().equals(id)); }
    public static Optional<Manga> findByTitle(String title) {return findManga(m -> m.getTitle().equals(title));}

    private static Optional<Manga> findManga(Predicate<Manga> predicate) {
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                return Optional.of(manga);
            }
        }
        return Optional.empty();
    }

}
