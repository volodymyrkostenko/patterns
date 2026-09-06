package factory;

public class EmailNotificationFactory extends Factory {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}