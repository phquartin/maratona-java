package phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEagear {
    private static final AircraftSingletonEagear INSTANCE = new AircraftSingletonEagear();

    private AircraftSingletonEagear() {
    }

    public static AircraftSingletonEagear getInstance() {
        return INSTANCE;
    }

    private final Set<String> availableSeats = new HashSet<>();
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
        availableSeats.add("1C");
    }
    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
