package phquartin.maratonajava.javacore.ZZJcrud.dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Anime {

    Integer id;
    String name;
    int episodes;
    Producer producer;

    @Override
    public String toString() {
        return "Anime: [" + id + "] - " + name + " - " + episodes + " - " + producer;
    }
}
