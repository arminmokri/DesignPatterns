package behavioral.visitor;

public class ImageFile implements FileElement {
    private final String name;
    private final int resolution;

    public ImageFile(String name, int resolution) {
        this.name = name;
        this.resolution = resolution;
    }

    public String getName() {
        return name;
    }

    public int getResolution() {
        return resolution;
    }

    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
