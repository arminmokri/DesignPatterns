package structural.composite;

public class File implements FileSystemItem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void display(String indent) {
        System.out.println(indent + "- File: " + name);
    }
}
