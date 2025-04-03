package phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1B");
        bookSeat("1A");
    }
    private static void bookSeat(String seat) {
        AircraftSingletonEnum aircraft = AircraftSingletonEnum.INSTANCE;
        System.out.println(aircraft.bookSeat(seat));
    }
}
