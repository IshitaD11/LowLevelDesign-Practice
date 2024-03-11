package ScalerLLD.DesignPatterns.Facade.Assignment4.services;

import ScalerLLD.DesignPatterns.Facade.Assignment4.models.Image;

public class ImageLoader {
    public Image loadImage(String imagePath) {
        return new Image();
    }
}
