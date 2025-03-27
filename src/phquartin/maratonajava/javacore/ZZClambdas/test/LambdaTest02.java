package phquartin.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> stringList = List.of("Pedro", "Joao", "Maria");
        List<Integer> integers = map(stringList, s -> s.length());
        System.out.println(integers);
    }

    private static <T, R>List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R apply = f.apply(e);
            result.add(apply);
        }
        return result;
    }

}
