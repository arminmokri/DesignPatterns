package behavioral.visitor;

public interface FileVisitor {
    void visit(TextFile textFile);

    void visit(ImageFile imageFile);

    void visit(AudioFile audioFile);
}
