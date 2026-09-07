package subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {
    private HashMap<String, List<StockObserver>> observers = new HashMap<>();
    

    public EventManager(String... operations) {
        for (String operation : operations) {
            observers.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String operation, StockObserver observer) {
        observers.get(operation).add(observer);
    }

    public void unsubscribe(String operation, StockObserver observer) {
        observers.get(operation).remove(observer);
    }

    public void notify(String operation) {
        
        for (StockObserver observer : observers.get(operation)) {
            observer.update(operation);
        }
    }
   
}
