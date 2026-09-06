package factory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification pushNotification = notificationFactory.createNotification("push");
        pushNotification.send("Hello via Push!");

        Notification smsNotification = notificationFactory.createNotification("sms");
        smsNotification.send("Hello via SMS!");

        Notification emailNotification = notificationFactory.createNotification("email");
        emailNotification.send("Hello via Email!");
    }
}