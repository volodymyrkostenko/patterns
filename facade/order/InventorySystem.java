package facade.order;

public class InventorySystem {
    public boolean checkInventory(String itemId) {
        System.out.println("Checking inventory for item: " + itemId);
        // Simulate inventory check
        return true;
    }

    void reduceStock(String itemId) {
        // Simulate reducing stock
        System.out.println("Reducing stock for item: " + itemId);
    }
}
