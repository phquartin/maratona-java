package phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.test;


import phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEagear;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        bookSeat("1B");
    }

    private static void bookSeat(String seat) {
        AircraftSingletonEagear aircraft = AircraftSingletonEagear.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}

