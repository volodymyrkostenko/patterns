package observer;

public class StockPriceEvent {
    public String ticker;
    public Double price;

    public StockPriceEvent(String ticker, Double price) {
        this.ticker = ticker;
        this.price = price;
    }
}
