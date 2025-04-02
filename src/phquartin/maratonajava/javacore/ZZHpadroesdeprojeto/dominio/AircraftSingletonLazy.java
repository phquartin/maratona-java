package phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;

    private AircraftSingletonLazy() {
    }

    public static AircraftSingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy();
                }
            }
        }
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
