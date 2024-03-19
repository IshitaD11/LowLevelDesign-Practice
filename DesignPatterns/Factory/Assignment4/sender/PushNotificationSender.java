package ScalerLLD.DesignPatterns.Factory.Assignment4.sender;


import ScalerLLD.DesignPatterns.Factory.Assignment4.NotificationType;
import ScalerLLD.DesignPatterns.Factory.Assignment4.notification.Notification;

public class PushNotificationSender extends NotificationSender {

    public PushNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Push notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}