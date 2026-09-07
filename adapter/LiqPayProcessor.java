package adapter;

public class LiqPayProcessor implements Payment {

    @Override
    public void process(Order order) {

        System.out.println("LiqPay: Списано " + order.findSellerCard() + " UAH з карти " + order.total.toString());
    }
}
