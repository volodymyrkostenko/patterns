package facade;

import facade.order.PaymentProcessor;
import facade.order.ShippingService;
import facade.order.InventorySystem;

public class OrderFacade {
  

    public void placeOrder(String accountId, String itemId, double price  ) {
        var inventorySystem = new InventorySystem();
        var paymentProcessor = new PaymentProcessor();
        var shippingService = new ShippingService();

        inventorySystem.checkInventory(itemId);
        paymentProcessor.processPayment(accountId, price);
        shippingService.shipItem(itemId);  
    }
}