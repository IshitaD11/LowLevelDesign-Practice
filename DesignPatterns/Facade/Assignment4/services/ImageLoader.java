package LowLevelDesign.DesignPatterns.Facade.Assignment4.services;

import LowLevelDesign.DesignPatterns.Facade.Assignment4.models.Image;

public class ImageLoader {
    public Image loadImage(String imagePath) {
        return new Image();
    }
}
