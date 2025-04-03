package phquartin.maratonajava.javacore.ZZEstreams.test;

import java.util.List;
import java.util.Optional;

public class StreamTest06 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> reduce1 = integers.stream()
                .reduce(Integer::sum);
        reduce1.ifPresent(System.out::println);

        Integer reduce = integers.stream()
                .reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
