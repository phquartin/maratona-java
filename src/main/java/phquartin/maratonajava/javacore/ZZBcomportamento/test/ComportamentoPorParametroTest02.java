package phquartin.maratonajava.javacore.ZZBcomportamento.test;

import phquartin.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import phquartin.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {

    private static List<Car> cars = new ArrayList<>(List.of(
            new Car("Blue", 2022),
            new Car("Black", 1999),
            new Car("Red", 2018)
    ));

    public static void main(String[] args) {
        List<Car> cars1 = filter(cars, new CarPredicate() {
            public boolean test(Car car) {
                return car.getColor().equals("Red");
            }
        });
        System.out.println(cars1);
    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> Cars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                Cars.add(car);
            }
        }
        return Cars;
    }
}
