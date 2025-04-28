package structural.composite;

public class File implements FileSystemItem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void display(String indent) {
        Main.println(indent + "- File: " + name);
    }

    @Override
    public int compareTo(FileSystemItem fileSystemItem) {
        if (fileSystemItem instanceof File) {
            File other = (File) fileSystemItem;
            return this.name.compareTo(other.name);
        } else {
            return 1;
        }

    }
}
