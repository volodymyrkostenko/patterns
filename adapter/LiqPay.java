package adapter;

public class LiqPay {

    public void sendMoney(String card, Double amountInUAH) {
        System.out.println("Send payment via LiqPay to " + card + " " + amountInUAH.toString() + " UAH");
    }
}
