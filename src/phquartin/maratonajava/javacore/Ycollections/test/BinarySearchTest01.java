package phquartin.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(0);
        numbers.add(10);
        numbers.add(4);
        numbers.add(2);
        numbers.add(8);

        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 10);
        System.out.println(numbers.get(index));
        System.out.println(Collections.binarySearch(numbers, 22)); // ( -(lastIndex) -1 )

    }
}
