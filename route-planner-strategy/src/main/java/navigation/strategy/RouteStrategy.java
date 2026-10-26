package navigation.strategy;

import navigation.model.Location;
import navigation.model.Route;

public interface RouteStrategy {

    Route buildRoute(Location from, Location to);
}
