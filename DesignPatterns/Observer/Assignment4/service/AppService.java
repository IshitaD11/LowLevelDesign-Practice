package LowLevelDesign.DesignPatterns.Observer.Assignment4.service;



import LowLevelDesign.DesignPatterns.Observer.Assignment4.Observer;
import LowLevelDesign.DesignPatterns.Observer.Assignment4.utils.NotificationUtils;

public class AppService implements Observer {
    @Override
    public void notifyObserver(Long taskId, Long userId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendPush(subject, String.format(message, taskId, userId));
    }
}
