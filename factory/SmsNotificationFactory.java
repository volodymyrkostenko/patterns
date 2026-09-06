package factory;

public class SmsNotificationFactory extends Factory {

    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}