package LowLevelDesign.DesignPatterns.Flyweight.Assignment2;

@IntrinsicState
public class GraphicIntrinsicState {
    private GraphicType type; // "text" or "image"
    private Image image; // Text content or image file path
    private int width, height; // Dimensions
    private String color; // Font color for text or image format for images

    public GraphicType getType() {
        return type;
    }
}
