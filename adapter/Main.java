package adapter;
public class Main {

    public static void main(String[] args) {
        Order order = new Order(1, 234, 166.0);
        PaymentProcessor paymentProvider = new PaymentProcessor();
        paymentProvider.sendPayment("paypal", order);
        paymentProvider.sendPayment("liqpay", order);
    }
}