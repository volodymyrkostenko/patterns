package adapter;

public class PayPalAdapter implements Payment {
    private final Paypal payPal;

    public PayPalAdapter(Paypal payPalObject) {
        payPal = payPalObject;
    }
  
    @Override
    public void process(Order order) {
        Double amountInUSD = order.total / 44;
        payPal.sendPayment(order.findSellerCard(), amountInUSD);
    }
}
