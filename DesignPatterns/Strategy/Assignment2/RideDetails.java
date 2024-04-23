package LowLevelDesign.DesignPatterns.Strategy.Assignment2;


public class RideDetails {
    private double distance; // Distance in kilometers
    private int duration; // Duration in minutes

    public RideDetails(double dist, int dur){
        this.distance = dist;
        this.duration = dur;
    }

    public double getDistance(){
        return distance;
    }

    public int getDuration(){
        return duration;
    }
}
