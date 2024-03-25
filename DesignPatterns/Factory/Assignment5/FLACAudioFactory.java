package LowLevelDesign.DesignPatterns.Factory.Assignment5;

import LowLevelDesign.DesignPatterns.Factory.Assignment5.player.AudioPlayer;
import LowLevelDesign.DesignPatterns.Factory.Assignment5.player.FLACPlayer;
import LowLevelDesign.DesignPatterns.Factory.Assignment5.decoder.AudioDecoder;
import LowLevelDesign.DesignPatterns.Factory.Assignment5.decoder.FLACDecoder;
import LowLevelDesign.DesignPatterns.Factory.Assignment5.processor.AudioProcessor;
import LowLevelDesign.DesignPatterns.Factory.Assignment5.processor.FLACAudioProcessor;

public class FLACAudioFactory extends AudioFactory{

    @Override
    public AudioDecoder creatAudioDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new FLACPlayer(volume, playbackRate);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new FLACAudioProcessor(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }
    
}
