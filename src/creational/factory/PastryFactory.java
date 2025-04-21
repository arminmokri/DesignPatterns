package creational.factory;

public class PastryFactory {
    public Pastry createPastry(String type) {
        return switch (type.toLowerCase()) {
            case "cake":
                yield new Cake();
            case "croissant":
                yield new Croissant();
            case "muffin":
                yield new Muffin();
            default:
                throw new IllegalArgumentException("Unknown pastry type: " + type);
        };
    }
}
