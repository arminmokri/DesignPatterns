package behavioral.visitor;

public interface FileElement {
    void accept(FileVisitor visitor);
}
