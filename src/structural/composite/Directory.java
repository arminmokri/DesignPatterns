package structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
}
