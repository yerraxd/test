package navigation.model;

import java.util.Locale;

public record Route(String transportMode, double distanceKm, double durationMinutes) {

    @Override
    public String toString() {
        return String.format(Locale.ROOT, "%-17s %6.2f km %7.1f min",
                transportMode, distanceKm, durationMinutes);
    }
}
