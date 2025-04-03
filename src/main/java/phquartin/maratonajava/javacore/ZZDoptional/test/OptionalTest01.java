package phquartin.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        find("Pedro");
        find("pedro");
    }
    private static Optional<String> find(String user) {
        List<String> userList = List.of("Pedro", "Joao", "Maria");
        if (userList.contains(user)) {
            return Optional.of(user);
        }
        return Optional.empty();
    }
}
