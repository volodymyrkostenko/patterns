package facade.order;

public class PaymentProcessor {
    public boolean processPayment(String accountId, double amount) {
        System.out.println("Processing payment of $" + amount + " for account: " + accountId);
        // Simulate payment processing
        return true;
    }
}
