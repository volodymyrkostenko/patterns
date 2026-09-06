package factory;

public class SmsNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS notification with message: " + message);
    }
}