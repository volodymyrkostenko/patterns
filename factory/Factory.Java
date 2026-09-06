package factory;

abstract class Factory {
    public abstract Notification createNotification();

    public void send(String message) {
        Notification notification = createNotification();
        notification.send("Hello, this is a " + type + " notification.");
    }
}