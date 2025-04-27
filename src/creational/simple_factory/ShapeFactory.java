package creational.simple_factory;

public class ShapeFactory {

    public final static String CIRCLE = "circle";
    public final static String SQUARE = "square";

    public static Shape createShape(String type) {
        return switch (type.toLowerCase()) {
            case ShapeFactory.CIRCLE -> new Circle();
            case ShapeFactory.SQUARE -> new Square();
            default -> throw new IllegalArgumentException("Unknown shape: " + type);
        };
    }
}
