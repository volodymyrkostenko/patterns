package subscriber;

public class Main {
    public static void main() {
        var stockManager = new StockManager(new EventManager("updateStock"));

        stockManager.eventManager.subscribe("updateStock", new EmailNotificationObserver("someemail@gmail.com"));
        stockManager.eventManager.subscribe("updateStock", new EmailNotificationObserver("someemail2@gmail.com"));
        stockManager.eventManager.subscribe("updateStock", new EmailNotificationObserver("someemail3@gmail.com"));
        stockManager.eventManager.subscribe("updateStock", new MobileNotificationObserver("090909093"));
        stockManager.eventManager.subscribe("updateStock", new MobileNotificationObserver("090909094"));
        stockManager.eventManager.subscribe("updateStock", new MobileNotificationObserver("090909099"));
        

        stockManager.changePrice();
    }
}
