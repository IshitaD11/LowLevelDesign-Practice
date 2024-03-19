package ScalerLLD.DesignPatterns.Factory.Assignment4;

import ScalerLLD.DesignPatterns.Factory.Assignment4.notification.EmailNotification;
import ScalerLLD.DesignPatterns.Factory.Assignment4.notification.Notification;
import ScalerLLD.DesignPatterns.Factory.Assignment4.sender.EmailNotificationSender;
import ScalerLLD.DesignPatterns.Factory.Assignment4.sender.NotificationSender;
import ScalerLLD.DesignPatterns.Factory.Assignment4.template.EmailNotificationTemplate;
import ScalerLLD.DesignPatterns.Factory.Assignment4.template.NotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory{

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new EmailNotification(recipient, sender, template);
    }

    @Override
    public NotificationSender creaNotificationSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }

    @Override
    public NotificationTemplate createNotificationTemplate(String message) {
        return new EmailNotificationTemplate(message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
    
    
    
}
