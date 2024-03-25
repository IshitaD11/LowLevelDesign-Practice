package LowLevelDesign.DesignPatterns.Factory.Assignment5;

import LowLevelDesign.DesignPatterns.Factory.Assignment5.player.AudioPlayer;
import LowLevelDesign.DesignPatterns.Factory.Assignment5.player.MP3Player;
import LowLevelDesign.DesignPatterns.Factory.Assignment5.decoder.AudioDecoder;
import LowLevelDesign.DesignPatterns.Factory.Assignment5.decoder.MP3Decoder;
import LowLevelDesign.DesignPatterns.Factory.Assignment5.processor.AudioProcessor;
import LowLevelDesign.DesignPatterns.Factory.Assignment5.processor.MP3AudioProcessor;

public class MP3AudioFactory extends AudioFactory{

    @Override
    public AudioDecoder creatAudioDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new MP3Player(volume, playbackRate);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new MP3AudioProcessor(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }
    
}
