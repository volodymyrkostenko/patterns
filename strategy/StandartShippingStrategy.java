package strategy;

public class StandartShippingStrategy implements ShippingStrategy {


    public Double calculate(DeliveryOrder order) {
        return order.weight * order.distance * order.price;
    }
}
