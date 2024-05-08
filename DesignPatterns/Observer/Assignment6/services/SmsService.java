package LowLevelDesign.DesignPatterns.Observer.Assignment6.services;

import LowLevelDesign.DesignPatterns.Observer.Assignment6.Observer;
import LowLevelDesign.DesignPatterns.Observer.Assignment6.utils.NotificationUtils;

public class SmsService implements Observer{

    @Override
    public void notifyObserver(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendSms(subject, message);
    }
    
    // public void sendSMS(String stockName, double currentPrice) {
    //     String subject = "Price update for " + stockName;
    //     String message = "New price is " + currentPrice;
    //     NotificationUtils.sendSms(subject, message);
    // }
}
