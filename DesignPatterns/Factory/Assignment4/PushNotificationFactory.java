package LowLevelDesign.DesignPatterns.Factory.Assignment4;

import LowLevelDesign.DesignPatterns.Factory.Assignment4.notification.Notification;
import LowLevelDesign.DesignPatterns.Factory.Assignment4.notification.PushNotification;
import LowLevelDesign.DesignPatterns.Factory.Assignment4.sender.NotificationSender;
import LowLevelDesign.DesignPatterns.Factory.Assignment4.sender.PushNotificationSender;
import LowLevelDesign.DesignPatterns.Factory.Assignment4.template.NotificationTemplate;
import LowLevelDesign.DesignPatterns.Factory.Assignment4.template.PushNotificationTemplate;

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
