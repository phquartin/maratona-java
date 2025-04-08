package phquartin.maratonajava.javacore.ZZJcrud.service;

import phquartin.maratonajava.javacore.ZZJcrud.dominio.Anime;
import phquartin.maratonajava.javacore.ZZJcrud.repository.AnimeRepository;

import java.util.List;

public class AnimeService {

    public static List<Anime> findByName(String name){
        return AnimeRepository.findByName(name);
    }

    public static void delete(int id){
        if (id <= 0) throw new IllegalArgumentException("Anime id must be greater than 0!");
        AnimeRepository.delete(id);
    }

    public static void create(Anime Anime){
        if (Anime == null) throw new IllegalArgumentException("Anime cannot be null!");
        if (Anime.getName() == null || Anime.getName().isBlank()) throw new IllegalArgumentException("Anime name cannot be null or blank!");
        AnimeRepository.create(Anime);
    }

    public static void update(Anime Anime) {
        if (Anime == null) throw new IllegalArgumentException("Anime cannot be null!");
        if (Anime.getName() == null || Anime.getName().isBlank())
            throw new IllegalArgumentException("Anime name cannot be null or blank!");
        if (Anime.getId() <= 0) throw new IllegalArgumentException("Anime id must be greater than 0!");
        AnimeRepository.update(Anime);
    }

}
