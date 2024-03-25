package LowLevelDesign.DesignPatterns.Factory.Assignment5;

import LowLevelDesign.DesignPatterns.Factory.Assignment5.player.AudioPlayer;
import LowLevelDesign.DesignPatterns.Factory.Assignment5.decoder.AudioDecoder;
import LowLevelDesign.DesignPatterns.Factory.Assignment5.processor.AudioProcessor;

public abstract class AudioFactory {

    public abstract AudioDecoder creatAudioDecoder(byte[] audioData);
    public abstract AudioPlayer createAudioPlayer(int volume, double playbackRate);
    public abstract AudioProcessor createAudioProcessor(byte[] audioData);

    public abstract MediaFormat supportsFormat();
}
