package phquartin.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        Stream.iterate(1, i -> 1 + i)
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(s -> System.out.print(s[0] + " "));

        System.out.println();

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(0, 100))
                .limit(10)
                .forEach(n -> System.out.print(n + " "));
    }
}
