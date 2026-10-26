package navigation.context;

import navigation.model.Location;
import navigation.model.Route;
import navigation.strategy.RouteStrategy;

import java.util.Objects;

public class Navigator {

    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "strategy must not be null");
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "strategy must not be null");
    }

    public Route planRoute(Location from, Location to) {
        return strategy.buildRoute(from, to);
    }
}
