package navigation.strategy;

import navigation.model.Location;
import navigation.model.Route;

public class CarStrategy implements RouteStrategy {

    private static final double ROAD_WINDING_FACTOR = 1.3;
    private static final double AVERAGE_SPEED_KMH = 40.0;
    private static final double MINUTES_PER_HOUR = 60.0;

    @Override
    public Route buildRoute(Location from, Location to) {
        double distanceKm = from.straightLineDistanceTo(to) * ROAD_WINDING_FACTOR;
        double durationMinutes = distanceKm / AVERAGE_SPEED_KMH * MINUTES_PER_HOUR;
        return new Route("Car", distanceKm, durationMinutes);
    }
}
