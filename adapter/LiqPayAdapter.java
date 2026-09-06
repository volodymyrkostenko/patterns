package adapter;

public class LiqPayAdapter implements Payment {

    private final LiqPay liqPay;

    public LiqPayAdapter(LiqPay liqPayObject) {
        liqPay = liqPayObject;
    }

    @Override
    public void sendMoneyForOrder(Order order) {

        liqPay.sendMoney(order.findSellerCard(), order.total);
    }
}
