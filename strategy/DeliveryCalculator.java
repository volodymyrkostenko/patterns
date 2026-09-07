package strategy;

import java.util.Map;

public class DeliveryCalculator {
    private Map<String, ShippingStrategy> deliveryStrategies;
    private ShippingStrategy currentStrategy;

    public DeliveryCalculator(StandartShippingStrategy standartShipingStrategy,
            ExpressShippingStrategy expressShippingStrategy) {

        this.deliveryStrategies = Map.of(
            DeliveryStrategies.STANDART.name(), standartShipingStrategy,
            DeliveryStrategies.EXPRESS.name(), expressShippingStrategy
        );
    }

    public void setCurrentStrategy(DeliveryStrategies strategyName) {
        this.currentStrategy = deliveryStrategies.get(strategyName.name());
    }

    public Double calculate(DeliveryOrder order) {
        return currentStrategy.calculate(order);
    }
}
