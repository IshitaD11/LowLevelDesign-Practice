package LowLevelDesign.DesignPatterns.Strategy.Assignment3;

public class QualityAdjustmentStrategyFactory {
    
    public static QualityAdjustmentStrategy getStrategy(VideoQuality videoQuality){
        switch (videoQuality) {
            case LOW: return new LowQualityStrategy();
                    
            case MEDIUM: return new MediumQualityStrategy();
             
            case HIGH: return new HighQualityStrategy();
        }

        throw new IllegalArgumentException("Unsupported video quality!");
    }
}
