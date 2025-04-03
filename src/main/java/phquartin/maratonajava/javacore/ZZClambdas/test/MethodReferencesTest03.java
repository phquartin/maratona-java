package phquartin.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferencesTest03 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of("Pedro", "Juan", "Carlos"));
        stringList.sort(String::compareTo);
        stringList.forEach(System.out::println);

        Function<String, Integer> strToInt = Integer::parseInt;
        Integer i = strToInt.apply("11");
        Integer j = strToInt.apply("11");
        System.out.println(i - j);

    }
}
