package LowLevelDesign.DesignPatterns.Factory.Assignment5.processor;

import LowLevelDesign.DesignPatterns.Factory.Assignment5.MediaFormat;

public abstract class AudioProcessor {

    private final byte[] audioData;

    public AudioProcessor(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();

    public abstract byte[] process();
}
