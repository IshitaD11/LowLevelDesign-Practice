package ScalerLLD.DesignPatterns.Factory.Assignment4;

import ScalerLLD.DesignPatterns.Factory.Assignment4.notification.Notification;
import ScalerLLD.DesignPatterns.Factory.Assignment4.notification.PushNotification;
import ScalerLLD.DesignPatterns.Factory.Assignment4.sender.NotificationSender;
import ScalerLLD.DesignPatterns.Factory.Assignment4.sender.PushNotificationSender;
import ScalerLLD.DesignPatterns.Factory.Assignment4.template.NotificationTemplate;
import ScalerLLD.DesignPatterns.Factory.Assignment4.template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory{

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new PushNotification(recipient, template);
    }

    @Override
    public NotificationSender creaNotificationSender(Notification notification) {
        return new PushNotificationSender(notification);
    }

    @Override
    public NotificationTemplate createNotificationTemplate(String message) {
        return new PushNotificationTemplate(message);
    }
    
}
