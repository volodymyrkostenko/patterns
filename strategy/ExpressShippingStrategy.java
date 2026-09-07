package strategy;

public class ExpressShippingStrategy implements ShippingStrategy {

    private Double additionalPriceForExpress;
    private Double additionalPriceForDistance;
    private Double additionalPriceForWeight;

    public ExpressShippingStrategy() {
        additionalPriceForExpress = 100.0;
        additionalPriceForDistance = 10.0;
        additionalPriceForWeight = 5.0;

    }

    public Double calculate(DeliveryOrder order) {
        return additionalPriceForExpress
                + order.weight * additionalPriceForWeight * order.distance * additionalPriceForDistance * order.price;
    }
}
