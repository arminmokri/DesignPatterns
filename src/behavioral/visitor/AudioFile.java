package behavioral.visitor;

public class AudioFile implements FileElement {
    private final String name;
    private final int duration;

    public AudioFile(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
