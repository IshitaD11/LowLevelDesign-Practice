package LowLevelDesign.DesignPatterns.Strategy.Assignment2;

public interface PricingStrategy {
    PricingType supportsType();
    public Double calculatePrice(RideDetails rideDetails);
}
