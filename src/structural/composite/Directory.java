package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemItem {
    private String name;
    private final List<FileSystemItem> children;

    public Directory(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    public void display(String indent) {
        System.out.println(indent + "+ Directory: " + name);
        for (FileSystemItem item : children) {
            item.display(indent + "  ");
        }
    }
}
