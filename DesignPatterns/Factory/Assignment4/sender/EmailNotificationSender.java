package LowLevelDesign.DesignPatterns.Factory.Assignment4.sender;

import LowLevelDesign.DesignPatterns.Factory.Assignment4.NotificationType;
import LowLevelDesign.DesignPatterns.Factory.Assignment4.notification.Notification;

public class EmailNotificationSender extends NotificationSender {

    public EmailNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Email notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
