package ScalerLLD.DesignPatterns.Factory.Assignment4.sender;


import ScalerLLD.DesignPatterns.Factory.Assignment4.NotificationType;
import ScalerLLD.DesignPatterns.Factory.Assignment4.notification.Notification;

public abstract class NotificationSender {
    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public abstract void send();

    public abstract NotificationType notificationType();

}