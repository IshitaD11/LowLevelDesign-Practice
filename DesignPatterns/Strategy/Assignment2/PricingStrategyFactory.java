package LowLevelDesign.DesignPatterns.Strategy.Assignment2;

public class PricingStrategyFactory {
    
    public static PricingStrategy getStrategy(PricingType pricingType){
        switch(pricingType){
            case TIME_BASED : return new TimeBasedPricingStrategy();
            case DISTANCE_BASED : return new DistanceBasedPricingStrategy();
            case SURGE : return new SurgePricingStrategy();
        }
        return null;
    }
}
