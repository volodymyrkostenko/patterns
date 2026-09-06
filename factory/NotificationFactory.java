package factory;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        Notification notification;
        if (type.equalsIgnoreCase("push")) {
            return new PushNotificationFactory().createNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SmsNotificationFactory().createNotification();
        } else if (type.equalsIgnoreCase("email")) {
            return new EmailNotificationFactory().createNotification();
        }
        throw new IllegalArgumentException("Unknown notification type: " + type);
    }
}