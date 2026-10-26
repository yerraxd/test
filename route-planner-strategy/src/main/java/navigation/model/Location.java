package navigation.model;

public record Location(String name, double xKm, double yKm) {

    public double straightLineDistanceTo(Location other) {
        return Math.hypot(xKm - other.xKm, yKm - other.yKm);
    }
}
