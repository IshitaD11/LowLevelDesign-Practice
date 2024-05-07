package LowLevelDesign.DesignPatterns.Observer.Assignment4;

public class TaskManager extends Publisher {

    public void assignTask(Long taskId, Long userId) {
        notifyObservers(taskId, userId);
    }
}
