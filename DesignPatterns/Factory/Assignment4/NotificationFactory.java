package LowLevelDesign.DesignPatterns.Factory.Assignment4;

import LowLevelDesign.DesignPatterns.Factory.Assignment4.notification.Notification;
import LowLevelDesign.DesignPatterns.Factory.Assignment4.sender.NotificationSender;
import LowLevelDesign.DesignPatterns.Factory.Assignment4.template.NotificationTemplate;

public abstract class NotificationFactory {

    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate template);
    public abstract NotificationSender creaNotificationSender(Notification notification);
    public abstract NotificationTemplate createNotificationTemplate(String message);


    public abstract NotificationType notificationType();

}
