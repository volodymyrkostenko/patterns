package observer;

public class StockManager {
    public EventManager eventManager;
    
    public StockManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    
    public StockPriceEvent changePrice() {
        StockPriceEvent event = new StockPriceEvent("AAPL", 150.0);
        eventManager.notify("updateStock");
        return event;
    }
}
