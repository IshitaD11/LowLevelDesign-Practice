package LowLevelDesign.DesignPatterns.Observer.Assignment5.services;

import LowLevelDesign.DesignPatterns.Observer.Assignment5.Observer;
import LowLevelDesign.DesignPatterns.Observer.Assignment5.utils.NotificationUtils;

public class HumidityService implements Observer {
    @Override
    public void notifyObserver(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}