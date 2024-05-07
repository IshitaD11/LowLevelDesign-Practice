package LowLevelDesign.DesignPatterns.Observer.Assignment5;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(double value);
}