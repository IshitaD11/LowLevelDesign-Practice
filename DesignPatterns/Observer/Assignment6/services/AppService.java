package LowLevelDesign.DesignPatterns.Observer.Assignment6.services;

import LowLevelDesign.DesignPatterns.Observer.Assignment6.Observer;
import LowLevelDesign.DesignPatterns.Observer.Assignment6.utils.NotificationUtils;

public class AppService implements Observer{
    // public void sendPush(String stockName, double currentPrice) {
    //     String subject = "Price update for " + stockName;
    //     String message = "New price is " + currentPrice;
    //     NotificationUtils.sendPush(subject, message);
    // }

    @Override
    public void notifyObserver(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendPush(subject, message);
    }
}
