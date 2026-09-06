package adapter;

public class Paypal {

    public void sendPayment(String email, Double amountInUSD) {
        System.err.println("Send via paypal to " + email + " " + amountInUSD.toString() + " USD");
    }
}
