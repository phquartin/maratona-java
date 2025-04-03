package phquartin.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest08 {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 1_000_000)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16})
                .average()
                .ifPresent(System.out::println);

        try(Stream<String> lines = Files.lines(Paths.get("test.txt"))){
            lines.filter(line -> line.startsWith("Hello"))
                    .forEach(System.out::println);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
