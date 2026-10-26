package navigation.strategy;

import navigation.model.Location;
import navigation.model.Route;

public class WalkStrategy implements RouteStrategy {

    private static final double ROAD_WINDING_FACTOR = 1.1;
    private static final double AVERAGE_SPEED_KMH = 5.0;
    private static final double MINUTES_PER_HOUR = 60.0;

    @Override
    public Route buildRoute(Location from, Location to) {
        double distanceKm = from.straightLineDistanceTo(to) * ROAD_WINDING_FACTOR;
        double durationMinutes = distanceKm / AVERAGE_SPEED_KMH * MINUTES_PER_HOUR;
        return new Route("Walk", distanceKm, durationMinutes);
    }
}
