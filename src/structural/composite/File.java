package structural.composite;

public class File implements FileSystemItem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void display(String indent) {
        Main.println(indent + "- File: " + name);
    }
}
