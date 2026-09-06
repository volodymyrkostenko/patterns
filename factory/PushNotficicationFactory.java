package factory;

public class PushNotificationFactory extends Factory {
   
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}