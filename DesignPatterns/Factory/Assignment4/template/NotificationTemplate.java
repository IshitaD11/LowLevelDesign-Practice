package LowLevelDesign.DesignPatterns.Factory.Assignment4.template;

import LowLevelDesign.DesignPatterns.Factory.Assignment4.NotificationType;

public abstract class NotificationTemplate {
    private String message;
    
    public NotificationTemplate(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
    
    public abstract String applyTemplate();
    public abstract NotificationType notificationType();

}