package phquartin.maratonajava.javacore.ZZDoptional.test;

import phquartin.maratonajava.javacore.ZZDoptional.dominio.Manga;
import phquartin.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> manga = Optional.of(MangaRepository.findById(1).orElse(new Manga("Novo manga", 20)));
        System.out.println(manga);
    }
}
