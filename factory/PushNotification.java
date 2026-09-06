package factory;

public class PushNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending push notification with message: " + message);
    }
}