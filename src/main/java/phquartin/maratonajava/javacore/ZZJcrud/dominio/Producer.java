package phquartin.maratonajava.javacore.ZZJcrud.dominio;

import lombok.Builder;
import lombok.Value;


@Value
@Builder
public class Producer {
    Integer id;
    String name;

    @Override
    public String toString() {
        return "Producer: [" + id + "] - " + name;
    }
}
