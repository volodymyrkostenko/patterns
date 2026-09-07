package strategy;

public class Main {
    public static void main(String[] args) {
        DeliveryCalculator calculator = new DeliveryCalculator(
            new StandartShippingStrategy(),
            new ExpressShippingStrategy()
        );
        
        calculator.setCurrentStrategy(DeliveryStrategies.STANDART);
        
        DeliveryOrder order = new DeliveryOrder(10.0, 100.0, 10.0);
        System.out.println("Standart: " + calculator.calculate(order));

        calculator.setCurrentStrategy(DeliveryStrategies.EXPRESS);
        System.out.println("Express: " + calculator.calculate(order));
    }
}
