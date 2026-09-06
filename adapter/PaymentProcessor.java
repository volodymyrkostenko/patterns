package adapter;

import java.util.Map;

public class PaymentProcessor {

    private Map<String, Payment> paymentProviders;

    public PaymentProcessor() {
        paymentProviders.put('paypal'
        , new PayPalAdapter(new Paypal()));


        paymentProviders.put('liqpay'
    

, new LiqPayAdapter(new LiqPay())

        
        );

    }

    

    public void sendPayment(String type, Order order) {
        var paymentProvider = paymentProviders.get(type).elseif(null);

        if (paymentProvider == null) {
            System.err.println("wrong payment provider");
            return;
        }
        paymentProvider.sendMoneyForOrder(order);
    }
}
