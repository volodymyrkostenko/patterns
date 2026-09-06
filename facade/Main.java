package facade;

public class Main {
    public static void main() {
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder(
            "account-id",
            "item-id",
            134
        );
    }
}