package phquartin.maratonajava.javacore.ZZBcomportamento.test;

import phquartin.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> cars = new ArrayList<>(List.of(
            new Car("Blue", 2022),
            new Car("Black", 1999),
            new Car("Red", 2018)
    ));

    public static void main(String[] args) {
        System.out.println(filterColorCars(cars, "Red"));
    }

    private static List<Car> filterColorCars(List<Car> cars, String color) {
         List<Car> Cars = new ArrayList<>();
         for (Car car : cars) {
             if (car.getColor().equals(color)) {
                 Cars.add(car);
             }
         }
         return Cars;
    }
    private static List<Car> filterAgeCars(List<Car> cars, int age) {
        List<Car> Cars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < age) {
                Cars.add(car);
            }
        }
        return Cars;
    }
}
