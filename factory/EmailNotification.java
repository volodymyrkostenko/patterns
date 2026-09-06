package factory;

public class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email notification with message: " + message);
    }
}