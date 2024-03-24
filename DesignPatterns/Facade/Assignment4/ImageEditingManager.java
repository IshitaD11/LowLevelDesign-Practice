package LowLevelDesign.DesignPatterns.Facade.Assignment4;

import LowLevelDesign.DesignPatterns.Facade.Assignment4.services.AnalyticsService;
import LowLevelDesign.DesignPatterns.Facade.Assignment4.services.FilterService;
import LowLevelDesign.DesignPatterns.Facade.Assignment4.services.ImageLoader;
import LowLevelDesign.DesignPatterns.Facade.Assignment4.services.ImageModifier;
import LowLevelDesign.DesignPatterns.Facade.Assignment4.services.ImageWriter;

public class ImageEditingManager {

    /*implementation without Facade*/
    /*
    private ImageLoader imageLoader;
    private FilterService filterService;
    private ImageModifier imageModifier;
    private ImageWriter imageWriter;
    private AnalyticsService analyticsService;

    public ImageEditingManager(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService) {
        this.imageLoader = imageLoader;
        this.filterService = filterService;
        this.imageModifier = imageModifier;
        this.imageWriter = imageWriter;
        this.analyticsService = analyticsService;
    }

    public void editImage(String imagePath, String filterType, int brightness) {

        Image image = imageLoader.loadImage(imagePath);

        filterService.applyFilter(image, filterType);
        imageModifier.adjustBrightness(image, brightness);

        imageWriter.saveImage(image);
        analyticsService.store(image);
    }*/

    /*implementation with Facade*/

    private ImageEditingFacade imageEditingFacade;

    public ImageEditingManager(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService) {
        imageEditingFacade = new ImageEditingFacade(imageLoader, filterService, imageModifier, imageWriter, analyticsService);
    }

    public void editImage(String imagePath, String filterType, int brightness) {
        imageEditingFacade.editImage(imagePath, filterType, brightness);
    }
}
