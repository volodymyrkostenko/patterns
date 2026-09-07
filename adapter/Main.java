package adapter;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        
        List<Payment> payments = List.of(
            new LiqPayProcessor(),
            new PayPalAdapter(new Paypal())
        );

        for (Payment payment : payments) {
            payment.process(new Order(1, 234, 166.0));
        }
    }
}