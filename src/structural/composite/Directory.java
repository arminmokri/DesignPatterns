package structural.composite;

import java.util.*;

public class Directory implements FileSystemItem {
    private String name;
    private final List<FileSystemItem> children;

    public Directory(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void add(FileSystemItem item) {
        children.add(item);
        Collections.sort(children);
    }

    @Override
    public void display(String indent) {
        if (Objects.isNull(indent)) {
            indent = "";
        }
        Main.println(indent + "+ Directory: " + name);
        for (FileSystemItem item : children) {
            item.display(indent + "  ");
        }
    }

    @Override
    public int compareTo(FileSystemItem fileSystemItem) {
        if (fileSystemItem instanceof Directory) {
            Directory other = (Directory) fileSystemItem;
            return this.name.compareTo(other.name);
        } else {
            return -1;
        }
    }
}
