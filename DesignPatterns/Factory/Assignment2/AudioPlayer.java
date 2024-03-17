package ScalerLLD.DesignPatterns.Factory.Assignment2;

public abstract class AudioPlayer {

    private int volume;
    private double playBackRate;

    public abstract void play();

    public abstract void pause();

    public abstract void stop();

    AudioPlayer(int volume,double playBackRate){
        this.volume=volume;
        this.playBackRate=playBackRate;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume set to " + volume);
        } else {
            System.out.println("Invalid volume level");
        }
    }

    public double getPlayBackRate() {
        return playBackRate;
    }

    public abstract MediaFormat supportsType();

}
