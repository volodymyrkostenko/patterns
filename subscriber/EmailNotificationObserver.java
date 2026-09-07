package subscriber;

public class EmailNotificationObserver implements StockObserver {

    private String email;
    
    public EmailNotificationObserver(String email) {
        this.email = email;
    }
    
    @Override
    public void update(String operation) {
        System.out.println("Email notification sent to " + email + " for operation: " + operation);
    }
}
