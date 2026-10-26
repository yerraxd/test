package navigation.strategy;

import navigation.model.Location;
import navigation.model.Route;

public class PublicTransportStrategy implements RouteStrategy {

    private static final double ROAD_WINDING_FACTOR = 1.25;
    private static final double AVERAGE_SPEED_KMH = 22.0;
    private static final double AVERAGE_WAITING_MINUTES = 6.0;
    private static final double MINUTES_PER_HOUR = 60.0;

    @Override
    public Route buildRoute(Location from, Location to) {
        double distanceKm = from.straightLineDistanceTo(to) * ROAD_WINDING_FACTOR;
        double rideMinutes = distanceKm / AVERAGE_SPEED_KMH * MINUTES_PER_HOUR;
        return new Route("Public transport", distanceKm, rideMinutes + AVERAGE_WAITING_MINUTES);
    }
}
