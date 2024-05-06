package LowLevelDesign.DesignPatterns.Strategy.Assignment3;

public class MediumQualityStrategy implements QualityAdjustmentStrategy{

    @Override
    public VideoQuality supportsType() {
        return VideoQuality.MEDIUM;
    }

    @Override
    public Video streamVideo(Video video) {
        video.setCodec(VideoCodec.H265);
        video.setBitrate(1000);
        return video; 
    }
    
}
