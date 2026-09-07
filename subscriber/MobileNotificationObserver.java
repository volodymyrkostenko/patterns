package subscriber;

public class MobileNotificationObserver implements StockObserver {
    private String phoneNumber;

    public MobileNotificationObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String operation) {
        System.out.println("Mobile notification sent to " + phoneNumber + " for operation: " + operation);
    }
}
