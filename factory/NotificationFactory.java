package factory;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type.equalsIgnoreCase("push")) {
            return new PushNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SmsNotification();
        } else if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }
        throw new IllegalArgumentException("Unknown notification type: " + type);
    }
}