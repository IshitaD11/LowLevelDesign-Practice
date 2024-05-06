package LowLevelDesign.DesignPatterns.Strategy.Assignment3;

public class Video {
    private String videoUrl;
    private VideoQuality videoQuality;
    private VideoCodec codec;
    private Integer bitrate;

    public Video(String videoUrl, VideoQuality videoQuality) {
        this.videoUrl = videoUrl;
        this.videoQuality = videoQuality;
    }

    public String getVideoUrl(){
        return videoUrl;
    }

    public void setCodec(VideoCodec videoCode) {
        this.codec = videoCode;
        
    }

    public void setBitrate(int bitRate) {
        this.bitrate = bitRate;
    }

    public VideoQuality getVideoQuality() {
        return this.videoQuality;        
    }
}