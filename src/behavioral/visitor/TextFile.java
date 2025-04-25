package behavioral.visitor;

public class TextFile implements FileElement {
    private final String name;
    private final int size;

    public TextFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
