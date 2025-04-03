package phquartin.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest15 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000L;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStream(num);
        sumParallelLongStream(num);
    }
    private static void sumFor(long num){
        System.out.println("Sum FOR");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result+" Sum FOR " + (end - init) + "ms");
    }
    private static void sumStreamIterate(long num){
        System.out.println("Sum Stream Iterate");
        long init = System.currentTimeMillis();
        Long reduce = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(reduce+" Sum Iterate " + (end - init) + "ms");
    }
    private static void sumParallelStream(long num){
        System.out.println("Parallel sum Iterate");
        long init = System.currentTimeMillis();
        Long reduce = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(reduce+" Parallel Sum Iterate " + (end - init) + "ms");
    }
    private static void sumParallelLongStream(long num){
        System.out.println("Parallel sum Long Iterate");
        long init = System.currentTimeMillis();
        Long reduce = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(reduce+" Parallel Sum Long Iterate " + (end - init) + "ms");
    }
}
