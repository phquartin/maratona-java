package phquartin.maratonajava.javacore.ZZBcomportamento.test;

import phquartin.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {

    private static List<Car> cars = new ArrayList<>(List.of(
            new Car("Blue", 2022),
            new Car("Black", 1999),
            new Car("Red", 2018)
    ));

    public static void main(String[] args) {
        List<Car> cars1 = filter(cars, car -> car.getColor().equals("Red"));
        System.out.println(cars1);
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }

}
