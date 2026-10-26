package navigation.app;

import navigation.context.Navigator;
import navigation.model.Location;
import navigation.strategy.CarStrategy;
import navigation.strategy.CycleStrategy;
import navigation.strategy.PublicTransportStrategy;
import navigation.strategy.RouteStrategy;
import navigation.strategy.WalkStrategy;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Location start = new Location("Bayterek Tower", 0.0, 0.0);
        Location destination = new Location("Astana IT University", 3.0, 4.0);

        List<RouteStrategy> availableStrategies = List.of(
                new CarStrategy(),
                new WalkStrategy(),
                new CycleStrategy(),
                new PublicTransportStrategy()
        );

        Navigator navigator = new Navigator(availableStrategies.get(0));
        System.out.println(start.name() + " -> " + destination.name());

        for (RouteStrategy strategy : availableStrategies) {
            navigator.setStrategy(strategy);
            System.out.println(navigator.planRoute(start, destination));
        }
    }
}
