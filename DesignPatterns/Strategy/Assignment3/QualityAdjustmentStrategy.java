package LowLevelDesign.DesignPatterns.Strategy.Assignment3;

public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();

    Video streamVideo(Video video);
}
