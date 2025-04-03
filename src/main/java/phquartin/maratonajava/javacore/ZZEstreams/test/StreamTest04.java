package phquartin.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Goku", "Boku", "Naruto"));

        List<String> list = words.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .toList();
        System.out.println(list);

        List<String> list1 = words.stream()
                .<String>mapMulti((s, consumer) -> {
                    for (char c : s.toCharArray()) {
                        consumer.accept(String.valueOf(c));
                    }
                })
                .toList();
        System.out.println(list1);
    }
}
