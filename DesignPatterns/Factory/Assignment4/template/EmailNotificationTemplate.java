package ScalerLLD.DesignPatterns.Factory.Assignment4.template;

import ScalerLLD.DesignPatterns.Factory.Assignment4.NotificationType;

public class EmailNotificationTemplate extends NotificationTemplate{
    public EmailNotificationTemplate(String message) {
        super(message);
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying Email notification template");
        return getMessage();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}